package com.example.hellospring.service;

public class GenerateUUID {
    public static String generateUUID() {
        return java.util.UUID.randomUUID().toString();
    }
}
