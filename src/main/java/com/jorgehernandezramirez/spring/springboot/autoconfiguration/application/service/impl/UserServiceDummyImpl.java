package com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.impl;

import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.api.IUserService;
import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.dto.UserDto;

import java.util.Arrays;
import java.util.List;

public class UserServiceDummyImpl implements IUserService {

    public UserServiceDummyImpl(){
        //For Spring
    }

    @Override
    public List<UserDto> getUsers() {
        return Arrays.asList(new UserDto("1", "Jorge"),
                new UserDto("2", "Jose"));
    }
}
