package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class AppConfiguration {
@RequestMapping("/Hello")
public String Hello() {
	return "<h1>This is my first Spring Boot Page "+"\n"
			+ "Thankyou for visiting</h1>";

	
} 
}
