package service;

import dto.ComputerDTO;
import entities.Computer;

public interface ComputerService {
    Computer getByProcessor(String proce);
    Computer saveComputer(ComputerDTO computerDTO);
}
