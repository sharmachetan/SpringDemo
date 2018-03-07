package com.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView getWelcome(){
	System.out.println("Method Called WElcome*********");
	return new ModelAndView("index");
}
}
