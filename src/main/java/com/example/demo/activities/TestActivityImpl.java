package com.example.demo.activities;


import org.springframework.beans.factory.annotation.Value;

public class TestActivityImpl implements TestActivity {

    @Value("country.language")
    String language;

    @Override
    public String sayHello(String name) {
        if (language.equalsIgnoreCase("en")) return "Hello " +name;
        return "Hola "+name;
    }
}