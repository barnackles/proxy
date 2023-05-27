package com.kodilla.proxy.forecast;

public class WeatherForecast implements Forecast {

    private String weather;

    public WeatherForecast() {
        this.weather = "Weather description.";
    }

    public String getWeather() {
        return weather;
    }

    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
        System.out.println("Updating weather...");
    }
}
