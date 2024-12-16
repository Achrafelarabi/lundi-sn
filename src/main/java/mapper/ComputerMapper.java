package mapper;

import dto.ComputerDTO;
import entities.Computer;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {
    private final ModelMapper modelMapper = new ModelMapper();

    public Computer toEntity(ComputerDTO dto) {
        return modelMapper.map(dto, Computer.class);
    }
}
