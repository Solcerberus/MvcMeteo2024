package com.example.mvcmeteo2024.controllers;

import com.example.mvcmeteo2024.models.ForecastModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForecastRestController {
    @PostMapping("/saveData")
    public void saveData(@RequestBody ForecastModel forecastModel) {
        // Here you can handle the received data
        System.out.println("Received data: " + forecastModel);
    }
}