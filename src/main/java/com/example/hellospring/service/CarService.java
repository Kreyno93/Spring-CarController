package com.example.hellospring.service;

import com.example.hellospring.model.Car;
import com.example.hellospring.repo.CarRepo;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.example.hellospring.service.GenerateUUID.generateUUID;

public class CarService {

    CarRepo carRepo = new CarRepo();

    public Car addCar(Car carToAdd) {
       return carRepo.addCar(carToAdd.withId(generateUUID()));
    }

    public List<Car> getAllCars() {
        return carRepo.getAllCars();
    }

    public void deleteCar(String id) {
        carRepo.deleteCar(id);
    }

    public void updateCar(String id, Car car) {
        carRepo.deleteCar(id);
        carRepo.addCar(car.withId(id));
    }
}
