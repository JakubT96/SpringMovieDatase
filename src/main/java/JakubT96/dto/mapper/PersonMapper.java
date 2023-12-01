package JakubT96.dto.mapper;

import JakubT96.dto.PersonDTO;
import JakubT96.entity.PersonEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface PersonMapper {
    PersonEntity toEntity(PersonDTO source);
    PersonDTO toDTO(PersonEntity source);
}
