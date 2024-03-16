package com.course.thymleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class MainController {

    @GetMapping("/home")
    public String loadHome(Model model){
        model.addAttribute("name","Ajay");
        return "home";
    }

    @GetMapping("/elvis")
    public String elvisExample(Model model){

        /* Conditional Statements
         * Elvis operator  ? :
         * If unless
         * switch case
         * */

        model.addAttribute("isAdmin",true);
        model.addAttribute("gender","M");
        return "elvis";
    }


    @GetMapping("/each")
    public String eachExample(Model model){

        /*
         * Iteration
         *
         * Thymeleaf provides a status variable for us to keep track of the process. Status variable has the following properties which are very useful
         * index: the current iteration index, starting with 0 (zero)
         * count: the number of elements processed so far
         * size: the total number of elements in the list
         * even/odd: checks if the current iteration index is even or odd
         * first: checks if the current iteration is the first one
         * last: checks if the current iteration is the last one
         * */

        List<String> stringList = List.of("First","Second","Third");
        model.addAttribute("list",stringList);
        return "each";
    }

/*
* There are 3 ways in which you can use fragments
* Include: it will insert the fragment as the body of the host tag excluding the fragment tag
* Insert: It will insert the fragment along with fragment tag as the body of the host tag
* Replace : it will replace the host tag with the fragment tag. Host tag will be removed and the fragment tag is added along with the fragment tag
*
* */



}
