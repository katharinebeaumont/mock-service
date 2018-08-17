package service.api;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ServiceController {

	private static final Logger log = LoggerFactory.getLogger(ServiceController.class);
	
	@RequestMapping("/heartbeat")
	@ResponseBody
	public HeartbeatResponse beat() {
		log.info("Replying to heartbeat");
		return new HeartbeatResponse();
	}

}