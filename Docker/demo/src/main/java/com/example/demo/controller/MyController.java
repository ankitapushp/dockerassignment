package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/myHome")
public class MyController {
	
	@GetMapping("/sweethome")
	public String myHome() {
		return "My Sweet Home !";
	}

}
