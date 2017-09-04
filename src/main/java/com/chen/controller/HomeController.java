package com.chen.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//@Component
@Controller
@RequestMapping(value ={ "/test1","/test2"})
public class HomeController {
	
	@RequestMapping(value = "/s",method = RequestMethod.GET)
	public String home(){
		return "home";
	}
	
}
