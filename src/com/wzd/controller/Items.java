package com.wzd.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/Anno")
public class Items {
	
	@RequestMapping("/items.action")
	public ModelAndView queryAllItems(){
		ModelAndView modelAndView = new ModelAndView();
		
		modelAndView.addObject("items", "this is queryAllItems items.");
		
		modelAndView.setViewName("item");
		
		return modelAndView;
	}

}
