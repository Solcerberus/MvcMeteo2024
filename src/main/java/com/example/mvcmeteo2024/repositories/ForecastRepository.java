package com.example.mvcmeteo2024.repositories;

import com.example.mvcmeteo2024.entities.ForecastEntity;
import org.springframework.data.repository.CrudRepository;

public interface ForecastRepository extends CrudRepository<ForecastEntity, Integer>{
}