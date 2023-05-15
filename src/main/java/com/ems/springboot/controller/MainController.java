package com.ems.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping("Location")
	public String Location() {
		
		return "Location.html";
		
	}
	
	@RequestMapping("Contact")
	public String Contact() {
		
		return "Contact.html";
		
	}
	
	@RequestMapping("Feedback")
	public String Feedback() {
		
		return "Feedback.html";
		
	}
	/*
	 * @GetMapping("/") public String home() { return "index"; }
	 */
}
