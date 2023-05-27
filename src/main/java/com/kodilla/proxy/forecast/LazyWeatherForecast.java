package com.kodilla.proxy.forecast;

public class LazyWeatherForecast implements Forecast {

    private Forecast forecast;


    @Override
    public String getWeather() {
        if (forecast == null) {
            forecast = new WeatherForecast();
        }
        return forecast.getWeather();
    }

    @Override
    public void refreshData() throws InterruptedException {
        if (forecast == null) {
            forecast = new WeatherForecast();
        }
        forecast.refreshData();
    }
}
