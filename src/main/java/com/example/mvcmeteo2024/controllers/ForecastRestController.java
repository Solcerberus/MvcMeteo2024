package com.example.mvcmeteo2024.controllers;

import com.example.mvcmeteo2024.entities.ForecastEntity;
import com.example.mvcmeteo2024.models.ForecastModel;
import com.example.mvcmeteo2024.services.MeteoService;
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

        var temperature = MeteoService.getTemperature(city, date);

        var forecastEntity = new ForecastEntity(city, date, temperature);
        forecastRepository.save(forecastEntity);
    }
}