package com.prueba.controller;

import com.prueba.entiity.Persona;
import com.prueba.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/v1")
@RestController
public class PersonaController {
    @Autowired
    IPersonaService personaService;
    //CRUD, create, read, update y delete
    @GetMapping("/persona")
    public List<Persona> read(){
        return personaService.read();
    }

    @DeleteMapping("/persona/{id}")
    public void delete(@PathVariable Long id){
        personaService.delete(id);
    }
    @PostMapping("/persona")
    public Persona create(@RequestBody Persona persona){
        return personaService.create(persona);
    }

    @PutMapping("/persona")
    public Persona update(@RequestBody Persona persona){
        return personaService.update(persona);
    }

}
