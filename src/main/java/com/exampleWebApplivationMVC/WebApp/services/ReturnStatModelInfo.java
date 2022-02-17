package com.exampleWebApplivationMVC.WebApp.services;

import com.exampleWebApplivationMVC.WebApp.models.StatModel;

public class ReturnStatModelInfo {

    public static StatModel getInfo(){

        int counter;

        StatModel sm = new StatModel("admin","password");

        return sm;
    }
}
