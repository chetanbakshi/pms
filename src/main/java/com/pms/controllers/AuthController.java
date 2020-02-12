package com.pms.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthController {
	
	@GetMapping("/login")
	public String getUser() {
		return "Chetan Bakshi";
	}

}
