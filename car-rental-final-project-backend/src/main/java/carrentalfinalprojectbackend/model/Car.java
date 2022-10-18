package carrentalfinalprojectbackend.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Car {

    @Id
    @GeneratedValue
    private int id;

    private String model;
    private String plateNumber;
    private String brand;
    private String type;
    private boolean status;

    @ManyToOne
    private Reservation reservation;

}
