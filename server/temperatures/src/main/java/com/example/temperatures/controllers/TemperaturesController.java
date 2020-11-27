package com.example.temperatures.controllers;

import com.example.temperatures.responses.temperatures.TemperatureResponse;
import com.example.temperatures.responses.temperatures.TemperaturesResponse;
import com.example.temperatures.utils.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class TemperaturesController {

    private static final Logger LOG = LoggerFactory.getLogger(TemperaturesController.class);

    @GetMapping(Paths.TEMPERATURES)
    public ResponseEntity<TemperaturesResponse> getAll() {
        List<TemperatureResponse> temperatureResponses = new ArrayList<>();
        temperatureResponses.add(new TemperatureResponse(
                "1",
                "35.6",
                new Date()
        ));
        temperatureResponses.add(new TemperatureResponse(
                "2",
                "26.9",
                new Date()
        ));

        LOG.info(temperatureResponses.toString());

        return new ResponseEntity<>(new TemperaturesResponse(temperatureResponses), HttpStatus.OK);
    }

    @GetMapping(Paths.TEMPERATURES + "/" + Paths.ID)
    public ResponseEntity<TemperatureResponse> getById(@PathVariable("id") String id) {
        TemperatureResponse temperatureResponse = new TemperatureResponse(
                id,
                "35.6",
                new Date()
        );

        LOG.info(temperatureResponse.toString());

        return new ResponseEntity<>(temperatureResponse, HttpStatus.OK);
    }

}
