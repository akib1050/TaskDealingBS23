package com.example.deshdeal.controller;

import com.example.deshdeal.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class HomeController {

    @Autowired
    CategoryService categoryService;

    @GetMapping({"/", "/home"})
    public String home(Model model){
        return "index";
    }



}
