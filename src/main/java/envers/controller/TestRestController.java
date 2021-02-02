package envers.controller;

import envers.entities.Animal;
import envers.entities.Person;
import envers.jpa.AnimalJpaRepo;
import envers.jpa.PersonJpaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestRestController {
    @Autowired
    private PersonJpaRepo personJpaRepo;
    @Autowired
    private AnimalJpaRepo animalJpaRepo;

    @GetMapping
    public ResponseEntity<String> hihi() {
        personJpaRepo.save(Person.builder().name("Person "+System.currentTimeMillis()).build());
        animalJpaRepo.save(Animal.builder().name("Animal "+System.currentTimeMillis()).build());

        return new ResponseEntity<>("OK LA", HttpStatus.OK);
    }
}
