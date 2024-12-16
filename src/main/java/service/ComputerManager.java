package service;

import dao.ComputerRepository;
import dto.ComputerDTO;
import entities.Computer;
import mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComputerManager implements ComputerService{
    @Autowired
    private ComputerRepository repository;

    @Autowired
    private ComputerMapper mapper;

    @Override
    public Computer getByProcessor(String proce) {
        return repository.findByProce(proce);
    }
    @Override
    public Computer saveComputer(ComputerDTO dto) {
        Computer computer = mapper.toEntity(dto);
        return repository.save(computer);
    }
}
