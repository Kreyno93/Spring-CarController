package com.example.hellospring.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.With;

@Data
@AllArgsConstructor
@Builder
public class Car {
    @With
    private String id;
    private String brand;
    private int numberOfWheels;
    private boolean tüv;

}
