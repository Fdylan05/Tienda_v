 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda.service;

import com.tienda.entity.Persona;
import java.util.List;
import com.tienda.repository.PersonaRepository;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class PersonaService implements IPersonaService{
    @Autowired
    private PersonaRepository personaRepository;
    
    @Override
    public List<Persona> getAllPerson(){
        return (List<Persona>)personaRepository.findAll();
    }
    
    @Override
    public void savePerson(Persona persona){
        personaRepository.save(persona);
    }
    
    @Override
    public Persona getPersonById(long id){
        return personaRepository.findById(id).orElse(null);
    }
    
    @Override
    public void delete(long id){
        personaRepository.deleteById(id);
    }
    
    @Override
    public Persona findByNombre(String nombre){
        return personaRepository.findByNombre(nombre);
    }
}
