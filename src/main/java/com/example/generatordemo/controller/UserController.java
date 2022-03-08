package com.example.generatordemo.controller;

import com.example.generatordemo.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value = "user")
@ResponseBody
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping(value = "register")
    public String register(User user) {
        int res = userService.register(user);
        if (res != 1) {
            return "fail";
        }
        return "success";
    }
}
