package entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Computer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPc;

    private String proce;
    private int ram;
    private int hardDrive;
    private double price;
    private String macAddress;
}
