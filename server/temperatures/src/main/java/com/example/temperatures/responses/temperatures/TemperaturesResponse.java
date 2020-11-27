package com.example.temperatures.responses.temperatures;

import java.util.List;

public class TemperaturesResponse {

    private List<TemperatureResponse> temperatures;

    public TemperaturesResponse() {
    }

    public TemperaturesResponse(List<TemperatureResponse> temperatures) {
        this.temperatures = temperatures;
    }

    public List<TemperatureResponse> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<TemperatureResponse> temperatures) {
        this.temperatures = temperatures;
    }

    @Override
    public String toString() {
        return "TemperaturesResponse{" +
                "temperatures=" + temperatures +
                '}';
    }
}
