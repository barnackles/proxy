package com.kodilla.proxy.forecast;

public interface Forecast {

    public String getWeather();

    public void refreshData() throws InterruptedException;
}
