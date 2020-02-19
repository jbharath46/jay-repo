package com.example.demo3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Demo3Application {


	@GetMapping("/")
	public String home() {
	return "Maven build with openshift!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Demo3Application.class, args);
	}

}
