package com.example.weather.controller;

import com.example.weather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    // This shows the actual HTML page when you open the app
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // This is the API that the Map uses to get current weather
    @GetMapping("/api/weather")
    @ResponseBody
    public String getWeather(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.getCurrentWeather(lat, lon);
    }

    // This is the API that the Map uses to get the 5-day forecast
    @GetMapping("/api/forecast")
    @ResponseBody
    public String getForecast(@RequestParam double lat, @RequestParam double lon) {
        return weatherService.getForecast(lat, lon);
    }
}