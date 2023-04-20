package moe.cafe.inspiration.main.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Sample hello world class
@RestController
public class MainController {
	
	@GetMapping("/hello")
	public String hello() {
		return "Hello, World!";
	}
	
}
