package com.naar.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("message","hello i am from controller");
        return "index";
    }
}
