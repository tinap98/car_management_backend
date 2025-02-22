package org.infosys.carmanagement.repository;



import java.util.List;

import java.util.Optional;
import org.infosys.carmanagement.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;






public interface CarRepository extends JpaRepository<Car, Integer> {

	
	Optional<Car> findByRegistrationNumber(String registrationNumber);

	Optional<Car> findByCarId(int carId);
	
	List<Car> findAllByCurrentStatus(String currentStatus);
    
}