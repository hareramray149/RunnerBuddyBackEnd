package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
   
	@PostMapping("/register")
	Boolean register() {
		return true;
	}
	
}
