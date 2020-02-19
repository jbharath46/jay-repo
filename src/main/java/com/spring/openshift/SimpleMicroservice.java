package com.spring.openshift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SimpleMicroservice{

	@GetMapping("/")
	public String welcome() {
		return "Maven deployment succesfull in openshift!";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "Hello " + input + "!! , Your application deployed successfully....";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroservice.class, args);
	}
}
