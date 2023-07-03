package com.orinaryaga.automotor.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.orinaryaga.automotor.Model.Car;

@Repository
public interface CarRepository extends CrudRepository<Car, Long> {
    // No need to define findById() and save() methods, as they are already provided
    // by CrudRepository

    // You can define additional methods if needed
    void deleteById(Long carId);

    @Override
    List<Car> findAll();
}