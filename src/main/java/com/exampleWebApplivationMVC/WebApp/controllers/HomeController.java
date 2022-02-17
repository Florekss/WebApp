package com.exampleWebApplivationMVC.WebApp.controllers;

import com.exampleWebApplivationMVC.WebApp.models.StatModel;
import com.exampleWebApplivationMVC.WebApp.services.ReturnStatModelInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

    private ReturnStatModelInfo returnStatModelService = new ReturnStatModelInfo();

    @RequestMapping("/")
    public @ResponseBody String welcome(){

        StatModel sm = returnStatModelService.getInfo();

        String user = sm.getUsername();

        return "Hello," + user + "!";
    }
}
