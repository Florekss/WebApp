package com.exampleWebApplivationMVC.WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CalcController {

    @GetMapping("/calc")
    public String calc(Model model){

        return "calc";
    }

    @GetMapping("/chart")
    public String chart(Model model){
        return "chart";
    }

}
