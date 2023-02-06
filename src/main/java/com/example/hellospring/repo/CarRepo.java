package com.example.hellospring.repo;

import com.example.hellospring.model.Car;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class CarRepo {

    private final Map<String, Car> cars = new HashMap<>();

    public Car addCar(Car car) {
        return cars.put(car.getId(), car);
    }

    public List<Car> getAllCars() {
        return new ArrayList<>(cars.values());
    }


    public void deleteCar(String id) {
        cars.remove(id);
    }
}
