package com.nvt.LaptopShopSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nvt.LaptopShopSpring.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String getHomePage(Model model) {
        model.addAttribute("lol", "Comunity");
        return "hello";
    }

    @GetMapping("/user/create")
    public String addUser(Model model) {
        model.addAttribute("lol", "Comunity");
        return "admin/user/create";
    }

}
