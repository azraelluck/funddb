package com.annfund.funddb.controller;

import com.annfund.funddb.entity.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
@RequestMapping("/testBoot")
public class testBootController {

    @RequestMapping("getUser")
    public User getUser(){

        User user = new User();
        user.setName("LiNan");
        return user;
    }
}
