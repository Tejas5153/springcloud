package com.user.controller;

import com.user.entity.User;
import com.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private UserService userService;

    @Autowired
    private RestTemplate restTemplate;
    @GetMapping("/{userId}")
    public User getUserInfoById(@PathVariable("userId") Long userId)
    {
        User user= this.userService.getUserInfoById(userId);
        List contacts =this.restTemplate.getForObject("http://localhost:1002/contact/user/"+userId, List.class);

        user.setContact(contacts);

        return user;


    }
}
