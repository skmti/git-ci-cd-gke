package com.gc;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class TestDeployApplication {
	private static final Log LOGGER = LogFactory.getLog(TestDeployApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(TestDeployApplication.class, args);
	}
	
	 @GetMapping("/")
	    String hello() {
		 
	        LOGGER.info("My info message");
	        LOGGER.warn("My warning message");
	        LOGGER.error("My error message");

		 
	      return "Hello GCP!";
	    }

}
