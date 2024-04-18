package com.example.mvcmeteo2024.controllers;

import com.example.mvcmeteo2024.entities.ForecastEntity;
import com.example.mvcmeteo2024.models.ForecastModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvcmeteo2024.models.ForecastSaveModel;
import com.example.mvcmeteo2024.repositories.ForecastRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ForecastRestController {
    @Autowired
    private ForecastRepository forecastRepository;
    @PostMapping("/saveData")
    public void saveData(@RequestBody ForecastSaveModel model) {
        var date = model.dateTime;
        var city = model.city;

        var forecastEntity = new ForecastEntity("Vilnius", "2024-01-01", "10");
        forecastRepository.save(forecastEntity);
    }
}