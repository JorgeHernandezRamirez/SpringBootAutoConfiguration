package com.jorgehernandezramirez.spring.springboot.autoconfiguration;

import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.Application;
import com.jorgehernandezramirez.spring.springboot.autoconfiguration.application.service.dto.UserDto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class,
        webEnvironment= SpringBootTest.WebEnvironment.RANDOM_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    public void shouldReturnDummyUserImpl() throws Exception {
        final ResponseEntity<List<UserDto>> userResponse = testRestTemplate.exchange("/user",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<UserDto>>() {
                });
        assertEquals(2, userResponse.getBody().size());
    }
}
