package com.kea.projects.superherov4.controller;
import com.kea.projects.superherov4.model.Superhero;
import com.kea.projects.superherov4.repositories.RepositoryDB;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;
import org.springframework.stereotype.Controller;

@RequestMapping("Superheroes")
@Controller
public class SuperheroController {

    RepositoryDB superheroDatabase;
    List<Superhero> superheroList;

    public SuperheroController(ApplicationContext context, @Value("${superhero.repository.impl}") String impl) {
        superheroDatabase = (RepositoryDB) context.getContext(impl);
    }

    @Autowired
    public SuperheroController(){

    }
    private Service superheroService;
    public SuperheroController(Service superheroService) {
        this.superheroService = superheroService;
    }

    @GetMapping(path="/year_created")
    ResponseEntity<List<Superhero>> getSuperheroDatabase() {
        return new ResponseEntity<List<Superhero>>(superheroList, HttpStatus.OK);
    }
    @GetMapping(path="/{navn}")
    public ResponseEntity<String> getSuperhero(@PathVariable String name){
        Superhero superhero = superheroService.getSuperhero(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");
        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getHeroName() + " " + superhero.getCreationYear()+ " " + superhero.getSuperpowerName() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }
    @GetMapping(path="/superpower/count/{navn}")
    public ResponseEntity<String> getHeroName(@PathVariable String name){
        Superhero superhero = superheroService.getHeroName(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");
        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getHeroName() + " " + superhero.getCreationYear()+ " " + superhero.getSuperpowerName() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }
     @GetMapping(path="/superpower/{navn}")
    public ResponseEntity<String> getSuperpowerName(@PathVariable String name){
        Superhero superhero = superheroService.getSuperpowerName(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");
        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getHeroName() + " " + superhero.getCreationYear()+ " " + superhero.getSuperpowerName() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }
    @GetMapping(path="/city/{navn}")
    public ResponseEntity<String> getCity(@PathVariable String name){
        Superhero superhero = superheroService.getCity(name);
        HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("Content-Type","text/html");
        return new ResponseEntity<String>(
                "<html><body><h1>" +
                        superhero.getHeroName() + " " + superhero.getCreationYear()+ " " + superhero.getSuperpowerName() +
                        "</h1></body></html>"
                ,responseHeaders, HttpStatus.OK);
    }

}