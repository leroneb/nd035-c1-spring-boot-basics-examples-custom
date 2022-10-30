package com.example.mvc_basics;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.Instant;

@Controller
public class HomeController {

    @RequestMapping("/home")
    public String getHomePage(Model model) {
        model.addAttribute("welcomeMessage", "Hi, Hello @ " + Instant.now().toString());
        return "home";
    }
    
    
    @GetMapping("/greeting")
    public String greeting(@RequestParam(name="name", required=false, defaultValue="World") String name, Model model) {
        model.addAttribute("name", name);
        // name of template to return
        return "greeting";
    }
}


