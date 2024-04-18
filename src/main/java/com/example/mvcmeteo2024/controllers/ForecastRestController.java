package com.example.mvcmeteo2024.controllers;

import com.example.mvcmeteo2024.models.ForecastModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.mvcmeteo2024.models.ForecastSaveModel;

@RestController
public class ForecastRestController {
    @PostMapping("/saveData")
    public void saveData(@RequestBody ForecastSaveModel model) {
        var date = model.dateTime;
        var city = model.city;

    }
}