package service.api;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class ServiceController {

	private static final Logger log = LoggerFactory.getLogger(ServiceController.class);
	@Value("${server.port}")
	private int port;
	
	@Value("${logging.file}")
	private String logFile;
	
	@GetMapping("/heartbeat")
	public HeartbeatResponse beat() {
		return new HeartbeatResponse();
	}
	
	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("port", port);
		return "home";
	}
	
	@GetMapping("/logs")
	public String logs(Model model) {
		
		//read in log file line by line
		log.info("Reading in " + logFile);
		List<String> logLines = new ArrayList<String>();
		try (BufferedReader br = new BufferedReader(new FileReader(logFile))) {

			String line;
			while ((line = br.readLine()) != null) {
				logLines.add(line);
			}

		} catch (IOException e) {
			log.error("Could not read " + logFile);
			e.printStackTrace();
		}
		LogView view = new LogView(logLines);
		model.addAttribute("logView", view);
		return "logs";
		
	}

}