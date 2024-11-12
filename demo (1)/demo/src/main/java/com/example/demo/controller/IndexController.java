package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;

import com.example.demo.model.User;

@Controller

public class IndexController {
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("user",new User());
		return "index";
	}
	
	@PostMapping("/register")
	public String userRegistration(@ModelAttribute User user) {
		System.out.println(user.toString());
		return "index";
	}
}
