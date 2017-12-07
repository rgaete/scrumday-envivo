package com.latam.scrumday.rest.mutation.envivo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvivoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHola() {
        return "Hola Mundo";
    }
}
