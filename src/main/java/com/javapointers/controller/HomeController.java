package com.javapointers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String viewHome() {
        return "index";
    }
    @RequestMapping("/add")
    public @ResponseBody String add(@RequestParam String number1, @RequestParam String number2) {
    		//ModelAndView mav = new ModelAndView();
    		System.out.println("in add" + number1 + " " + number2);
    		System.out.println((new Integer(number1) + new Integer(number2)));
    		return Integer.toString((new Integer(number1) + new Integer(number2)));
    }
    
}
