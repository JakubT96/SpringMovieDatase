package JakubT96.controller;

import JakubT96.dto.PersonDTO;
import JakubT96.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PersonController {
@Autowired
    private PersonService personService;

    @PostMapping({"/people/", "/people"})
    public PersonDTO addPerson(@RequestBody PersonDTO personDTO) {
        return personService.addPerson(personDTO);
    }
    
}
