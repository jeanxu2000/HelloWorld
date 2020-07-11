package com.javacodegeeks.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello Java Code Geeks!";
	}
	
	@GetMapping("/message")
	public String sayMessage() {
		return "This is secret message";
	}
}
