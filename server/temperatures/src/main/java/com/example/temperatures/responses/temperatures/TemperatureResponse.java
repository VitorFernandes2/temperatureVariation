package com.example.temperatures.responses.temperatures;

import java.util.Date;

public class TemperatureResponse {

    private String id;
    private String degrees;
    private Date date;

    public TemperatureResponse() {
    }

    public TemperatureResponse(String id, String degrees, Date date) {
        this.id = id;
        this.degrees = degrees;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDegrees() {
        return degrees;
    }

    public void setDegrees(String degrees) {
        this.degrees = degrees;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "TemperatureResponse{" +
                "id='" + id + '\'' +
                ", degrees='" + degrees + '\'' +
                ", date=" + date +
                '}';
    }
}
