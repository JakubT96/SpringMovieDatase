package JakubT96.service;

import JakubT96.dto.PersonDTO;
import JakubT96.dto.mapper.PersonMapper;
import JakubT96.entity.PersonEntity;
import JakubT96.entity.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;
    @Autowired
    private PersonMapper personMapper;

    public PersonDTO addPerson(PersonDTO personDTO) {
        PersonEntity entity = personMapper.toEntity(personDTO);
        PersonEntity savedEntity = personRepository.save(entity);
        return personMapper.toDTO(savedEntity);
    }

}
