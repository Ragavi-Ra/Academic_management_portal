package com.school.sasschool.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping(value={"", "/", "home"})
    public String displayHomePage() {
        return "home.html";
    }

    @RequestMapping("/pageerror")
    public String displayError(Model model) {
        //List<Courses> courses = coursesRepository.findByOrderByNameDesc();
        return "pageerror.html";
    }
}
