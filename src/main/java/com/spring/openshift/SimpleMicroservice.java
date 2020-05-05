package com.spring.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleMicroservice{

	@GetMapping("/welcome")
	public String welcome() {
		return "Welcome !!!</font>";
	}

	@GetMapping("/api/greetings/v1")
	public String greetings() {
		return "Hi ,Greetings !!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroservice.class, args);
	}
}
