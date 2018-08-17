package service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = {"service.*"})
public class ServiceApplication {
	
	private static final Logger log = LoggerFactory.getLogger(ServiceApplication.class);
	
	public static void main(String[] args) {
		SpringApplication.run(ServiceApplication.class, args);
	}
	
	@Bean
    CommandLineRunner init(ApplicationContext appContext) {
		log.info("Initialising .... ");
		return null;
    }
}