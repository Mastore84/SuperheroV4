package com.kea.projects.superherov4.repositories;

import com.kea.projects.superherov4.model.Superhero;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface IRepositoryInterface {
    List<Superhero> getAllCreationYear();
    List<Superhero> getSpecificCreationYear(String heroname);
    List<Superhero> getAllSuperpowersAmount();
    List<Superhero> getSpecificSuperpowersAmount(String heroname);
    List<Superhero> getAllSuperpowers();
    List<Superhero> getSpecificSuperpowers(String heroname);
    List<Superhero> getAllCity();
    List<Superhero> getSpecificCity(String heroname);
}