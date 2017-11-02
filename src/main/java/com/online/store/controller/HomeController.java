package com.online.store.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
	@RequestMapping("/")
	public String welcome(Model model){
		model.addAttribute("greeting", "welcome to online store");
		model.addAttribute("tagline","Develop by Ravindra");
		return "welcome";
	}
}
