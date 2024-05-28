package com.example.mixacommunity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by Hai on 2024-05-28 at 12:40:31
 */
@Controller
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam (name = "name") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
