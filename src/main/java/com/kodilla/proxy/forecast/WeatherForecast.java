package com.kodilla.proxy.forecast;

public class WeatherForecast {
    private String weather;

    public String getWeather() {
        return weather;
    }
    public void refreshData() throws InterruptedException {
        Thread.sleep(5000);
        weather = getWeather();
    }
}
