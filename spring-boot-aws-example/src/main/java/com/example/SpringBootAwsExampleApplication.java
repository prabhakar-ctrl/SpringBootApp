package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootAwsExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootAwsExampleApplication.class, args);
	}

	@GetMapping("/msg")
	public String getMessage() {
		return "Welcome to AWS";
	}
}
