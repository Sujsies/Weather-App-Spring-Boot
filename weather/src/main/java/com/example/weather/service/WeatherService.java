package com.example.weather.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class WeatherService {

    @Value("${weather.api.key}")
    private String apiKey;

    private final String WEATHER_URL = "https://api.openweathermap.org/data/2.5/weather";
    private final String FORECAST_URL = "https://api.openweathermap.org/data/2.5/forecast";

    private final RestTemplate restTemplate = new RestTemplate();

    public String getCurrentWeather(double lat, double lon) {
        // Simpler way: Building the URL string manually
        String url = WEATHER_URL + "?lat=" + lat + "&lon=" + lon + "&units=metric&appid=" + apiKey;
        
        return restTemplate.getForObject(url, String.class);
    }

    public String getForecast(double lat, double lon) {
        // Simpler way: Building the URL string manually
        String url = FORECAST_URL + "?lat=" + lat + "&lon=" + lon + "&units=metric&appid=" + apiKey;

        return restTemplate.getForObject(url, String.class);
    }
}