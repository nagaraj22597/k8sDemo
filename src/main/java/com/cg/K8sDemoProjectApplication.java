package com.cg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class K8sDemoProjectApplication {
	
	
	@GetMapping("/add")
	public String displayMessage()
	{
		return "Hello World";
	}
	public static void main(String[] args) {
		SpringApplication.run(K8sDemoProjectApplication.class, args);
	}

}
