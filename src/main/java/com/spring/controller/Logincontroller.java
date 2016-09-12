package com.spring.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
public class Logincontroller {
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String init(Model model) {
        model.addAttribute("msg", "Please Enter Your Login Details");
        return "LOGIN";
    }
 
    @RequestMapping(method = RequestMethod.POST)
    public String submit(Model model, @ModelAttribute("login") Login login) {
        if (login != null && login.getUsername() != null & login.getPassword() != null) {
            if (login.getUsername().equals("user") && login.getPassword().equals("12345")) {
                model.addAttribute("msg", "welcome" + login.getUsername());
                return "HOME";
            } else {
                model.addAttribute("error", "Invalid Details");
                return "LOGIN";
            }
        } else {
            model.addAttribute("error", "Please enter Details");
            return "LOGIN";
        }
    }
}