package com.javapointers.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Jerry Conde, webmaster@javapointers.com
 * @since 8/9/2016
 */
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
    		//mav.addObject("number1", number1);
    		//mav.addObject("number2", number2);
    		System.out.println((new Integer(number1) + new Integer(number2)));
    		//mav.addObject("total", (new Integer(number1) + new Integer(number2)));
    		//mav.setViewName("result");
    		return Integer.toString((new Integer(number1) + new Integer(number2)));
    }
    
}
