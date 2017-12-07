package com.latam.scrumday.rest.mutation.envivo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvivoController {

    @RequestMapping(method = RequestMethod.GET)
    public String getHola() {
        return "Hola Mundo";
    }

    @RequestMapping(path = "mutants/{id}", method = RequestMethod.GET)
    public ResponseEntity getMutant(@PathVariable Integer id) {
        Mutant mutant = new Mutant();
        mutant.setName("scrumDay");
        return ResponseEntity.ok(mutant);
    }
}
