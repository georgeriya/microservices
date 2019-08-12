package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CabDriverController {

	@GetMapping("/drivers")
	public String getDriver() {
		return "Manas - 123456789";
	}
}
