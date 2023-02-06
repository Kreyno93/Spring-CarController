package com.example.hellospring.controller;

import com.example.hellospring.model.Car;
import com.example.hellospring.service.CarService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CarController {

    CarService carService = new CarService();

    @PostMapping("/add-car")
    public Car addCar(@RequestBody Car car) {
       return carService.addCar(car);
    }

    @GetMapping("/get-all-cars")
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @DeleteMapping("/delete-car/{id}")
    public void deleteCar(@PathVariable String id) {
        carService.deleteCar(id);
    }

    @PutMapping("/update-car/{id}")
    public void updateCar(@PathVariable String id, @RequestBody Car car) {
        carService.updateCar(id, car);
    }

}
