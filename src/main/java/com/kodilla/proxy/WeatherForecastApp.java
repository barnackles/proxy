package com.kodilla.proxy;

import com.kodilla.proxy.forecast.Forecast;
import com.kodilla.proxy.forecast.LazyWeatherForecast;

import java.util.Random;

public class WeatherForecastApp {
    public static void main(String[] args) throws InterruptedException {
        long begin = System.currentTimeMillis();

        for (int n = 0; n < 10; n++) {
            //Forecast weatherForecast = new WeatherForecast();
            //lazy
                Forecast weatherForecast = new LazyWeatherForecast();
            int number = new Random().nextInt(100);
            if (number < 20)
                weatherForecast.refreshData();
            else System.out.println(weatherForecast.getWeather());

            System.out.println("Execution #" + n + " just finished");
        }

        long end = System.currentTimeMillis();
        System.out.println("The execution took: " + (end - begin) + " [ms]");
    }


}
