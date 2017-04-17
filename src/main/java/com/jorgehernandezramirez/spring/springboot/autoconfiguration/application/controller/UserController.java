package com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.controller;

import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.api.IUserService;
import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private IUserService userService;

    public UserController(){
        //For Java
    }

    @RequestMapping
    public List<UserDto> getUsers(){
        return userService.getUsers();
    }
}
