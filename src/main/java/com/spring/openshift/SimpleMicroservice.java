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
		return "<font size=6><b>Welcome !</b></font>";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "<font size=6>Hello  " + input + ",!! <br><br><br><br>  <b> Build and deployment successfull.</b></font>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroservice.class, args);
	}
}
