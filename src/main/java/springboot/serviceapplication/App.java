package springboot.serviceapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App
{
	@GetMapping("/")
	public String home() {
		return "Spring boot is working!";
	}
	
	@GetMapping("/test")
	public String test(@PathVariable String path) {
		return "Spring boot"+path+" is working!";
	}

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}
}
