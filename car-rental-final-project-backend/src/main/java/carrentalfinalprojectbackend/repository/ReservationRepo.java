package carrentalfinalprojectbackend.repository;

import carrentalfinalprojectbackend.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepo extends JpaRepository<Reservation,Integer> {
}
