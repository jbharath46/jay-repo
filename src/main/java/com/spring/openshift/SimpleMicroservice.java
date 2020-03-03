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
		return "<font size=6><b>Introduction to OpenShift Container Platform </b></font> <br><br><br><br><br><font size=5><p>OpenShift Container Platform is a platform for developing and running containerized applications. It is designed to allow applications and the data centers that support them to expand from just a few machines and applications to thousands of machines that serve millions of clients.With its foundation in Kubernetes, OpenShift Container Platform incorporates the same technology that serves as the engine for massive telecommunications, streaming video, gaming, banking, and other applications. Its implementation in open Red Hat technologies lets you extend your containerized applications beyond a single cloud to on-premise and multi-cloud environments</p></font>";
	}

	@GetMapping("/{input}")
	public String congrats(@PathVariable String input) {
		return "<font size=6>Hello" + input + ",!! <br><br><br><br>  <b> Build and deployment successfull.</b></font>";
	}

	public static void main(String[] args) {
		SpringApplication.run(SimpleMicroservice.class, args);
	}
}
