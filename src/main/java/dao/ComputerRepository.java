package dao;

import entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComputerRepository extends JpaRepository<Computer,Long> {
    Computer findByProce(String proce);
}
