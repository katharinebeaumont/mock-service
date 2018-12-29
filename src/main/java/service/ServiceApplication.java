package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = {"service.*"})
public class ServiceApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceApplication.class);
	
	public static void main(String[] args) {
		log.info("Starting mock service");
		SpringApplication app = new SpringApplication(ServiceApplication.class);
		app.addListeners(new ApplicationPidFileWriter());
		app.run(args);
	}
}