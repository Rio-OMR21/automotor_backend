package com.orinaryaga.automotor.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orinaryaga.automotor.Model.Car;
import com.orinaryaga.automotor.Repository.CarRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
    private CarRepository carRepository;

    public Car createCar(Car car) {
        return carRepository.save(car);
    }

    public Car getCarById(Long carId) {
        Optional<Car> carOptional = carRepository.findById(carId);
        if (carOptional.isPresent()) {
            return carOptional.get();
        } else {
            throw new CarNotFoundException("Car not found with id: " + carId);
        }
    }

    public Car updateCar(Long carId, Car updatedCar) {
        Optional<Car> carOptional = carRepository.findById(carId);
        if (carOptional.isPresent()) {
            Car car = carOptional.get();
            car.setCarBrand(updatedCar.getCarBrand());
            car.setCarModel(updatedCar.getCarModel());
            car.setProductionDate(updatedCar.getProductionDate());
            car.setCarType(updatedCar.getCarType());
            car.setCarDescription(updatedCar.getCarDescription());
            return carRepository.save(car);
        } else {
            throw new CarNotFoundException("Car not found with id: " + carId);
        }
    }

    public void deleteCar(Long carId) {
        Optional<Car> carOptional = carRepository.findById(carId);
        if (carOptional.isPresent()) {
            carRepository.deleteById(carId);
        } else {
            throw new CarNotFoundException("Car not found with id: " + carId);
        }
    }

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }
}