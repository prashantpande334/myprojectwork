package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class EmployeeController {
	
	@GetMapping("/welcome")
	public String mymethod() {
		
		return "my project ";
	}

}
