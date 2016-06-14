package edu.shop.java.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	public HomeController(){
	}
	
	@RequestMapping(value="/home", method=RequestMethod.GET)
	public ModelAndView index(){
//		System.out.println("123456");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("home");
		
		return modelAndView;
	}

}
