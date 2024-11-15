package com.ubsecure.ubsecure.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.ui.Model;

// import ch.qos.logback.core.model.Model;

@Controller
public class PageController {
     @RequestMapping("/home")     
    public String home(Model model){
         System.out.println("Home page handler ");
         model.addAttribute("name","Ujwal Thakare");   
         return "home";
    }
    @RequestMapping("/index.html")
    public String index(){
        System.out.println("Index page handler ");
        return "index";
    }
   


}
