package com.example.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class MainController {

    @RequestMapping(value = "/",method = RequestMethod.GET)
    public String home()
    {
        return "home";
    }

    @RequestMapping("/displaydata")
    public ModelAndView displayData(@RequestParam("name") String name)
    {
        ModelAndView modelAndView = new ModelAndView("display");
        modelAndView.addObject("name",name);
        return modelAndView;
    }
}
