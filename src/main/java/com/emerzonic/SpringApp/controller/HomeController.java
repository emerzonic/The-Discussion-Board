package com.emerzonic.SpringApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({"/", ""})
     String home() throws Exception{
        return "home";
    }
}
