package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
//@RequestMapping("books")  
public class HomeController {

	@GetMapping("/1.html")
	public String xxxs() {
		System.out.println("1111111111111");
		return "home";
	}
	@GetMapping("/index")
	public String index() {
		System.out.println("indexindex");
		return "home";
	}
	@GetMapping("2")
	public String a2() {
		System.out.println("22222");
		return "22222222";
	}
}
