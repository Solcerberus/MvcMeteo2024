package com.example.mvcmeteo2024.models;

import java.util.ArrayList;

public class Root{
    public Place place;
    public String forecastType;
    public String forecastCreationTimeUtc;
    public ArrayList<ForecastTimestamp> forecastTimestamps;
}