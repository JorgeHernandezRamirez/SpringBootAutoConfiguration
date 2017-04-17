package com.jorgehernandezramirez.spring.springboot.autoconfiguration.configuration;

import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.api.IUserService;
import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.impl.UserServiceDummyImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfiguration {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserConfiguration.class);

    @Bean
    public IUserService buildUserService(){
        LOGGER.info("Building user service dummy impl...");
        return new UserServiceDummyImpl();
    }
}
