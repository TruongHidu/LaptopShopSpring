package com.nvt.LaptopShopSpring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.nvt.LaptopShopSpring.domain.User;
import com.nvt.LaptopShopSpring.service.UserService;

@Controller
public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping("/")
    public String getHomePage(Model model) {

        return "hello";
    }

    @RequestMapping("/admin/user/create")
    public String addUser(Model model) {
        model.addAttribute("newUser", new User());
        return "admin/user/create";
    }

    @RequestMapping(value = "admin/user/create", method = RequestMethod.POST)
    public String addUser1(Model model, @ModelAttribute("newUser") User newUser) {
        System.out.println("run here" + newUser);
        return "hello";
    }

}
