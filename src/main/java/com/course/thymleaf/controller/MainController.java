package com.course.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name","Ajay");
        return "home";
    }

    @GetMapping("/elvis")
    public String elvisExample(Model model){
        model.addAttribute("isAdmin",true);
        model.addAttribute("gender","M");
        return "elvis";
    }

    /* Conditional Statements
     * Elvis operator  ? :
     * If unless
     * switch case
     * */





}
