package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoDockerDockerhubK8sApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoDockerDockerhubK8sApplication.class, args);
	}

	@GetMapping("/")
	public String welcome() {
		return "Welcome to INDIA!!!!!!!!!!";
	}
}
