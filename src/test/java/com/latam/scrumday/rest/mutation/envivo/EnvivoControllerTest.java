package com.latam.scrumday.rest.mutation.envivo;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EnvivoControllerTest {

    @Test
    public void shouldReturnHolaMundo() throws Exception {

        EnvivoController envivoController = new EnvivoController();
        assertThat(envivoController.getHola(),is("Hola Mundo"));

    }
}