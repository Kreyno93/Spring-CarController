package com.example.hellospring.exceptions;

public class CarNotFoundException extends RuntimeException{

    public CarNotFoundException(String id) {
        super("Car with id " + id + " does not exist");
    }

}
