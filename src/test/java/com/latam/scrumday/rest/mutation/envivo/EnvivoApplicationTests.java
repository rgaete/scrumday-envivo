package com.latam.scrumday.rest.mutation.envivo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EnvivoApplicationTests {

    @Autowired
    private EnvivoController envivoController;

    @Test
    public void contextLoads() {

        assertThat(envivoController, is(not(nullValue())));

    }
/*
    @Test
    public void springBootShouldReturnHolaMundo() throws Exception {
        RestTemplate restTemplate = new RestTemplate();


    }*/
}
