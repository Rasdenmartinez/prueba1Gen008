package com.prueba.service;

import com.prueba.entiity.Persona;

import java.util.List;

public interface IPersonaService {
    public List<Persona> read();
    public void delete(Long id);
    public Persona create(Persona persona);
    public Persona update(Persona persona);


}
