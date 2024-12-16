package web;

import dto.ComputerDTO;
import entities.Computer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import service.ComputerService;

@Controller
public class ComputerGraphQLController {

    @Autowired
    private ComputerService computerService;

    @QueryMapping
    public Computer getComputerByProce(String proce) {
        return computerService.getByProcessor(proce);
    }

    @MutationMapping
    public Computer saveComputer(ComputerDTO computerDTO) {
        return computerService.saveComputer(computerDTO);
    }
}
