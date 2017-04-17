package com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.api;

import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.dto.UserDto;

import java.util.List;

/**
 * Api de usuarios
 */
public interface IUserService {

    /**
     * Método que debe devolver la lista de usuarios en el sistema
     * @return
     */
    List<UserDto> getUsers();
}
