package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class SpringBootMaven1Application {

	@GetMapping("/message")
	public String getMessage() {
		
		return "Om guru";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootMaven1Application.class, args);
		System.out.println("Test");
		System.out.println("Test123");
	}

}
