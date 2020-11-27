package com.example.temperatures.requests.temperatures;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@Validated
public class TemperatureRequest {

    @Valid
    @NotNull
    private String degrees;

    public TemperatureRequest() {
    }

    public TemperatureRequest(String degrees) {
        this.degrees = degrees;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    @Override
    public String toString() {
        return "TemperatureRequest{" +
                "degrees='" + degrees + '\'' +
                '}';
    }
}
