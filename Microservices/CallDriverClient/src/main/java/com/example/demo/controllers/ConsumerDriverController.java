package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerDriverController {

	@Autowired
	private RestTemplate template;
	
	@GetMapping("/findDriver")
	public String getDriverDetails() {
		return template.getForObject("http://call-driver/drivers", String.class);
	}
}
