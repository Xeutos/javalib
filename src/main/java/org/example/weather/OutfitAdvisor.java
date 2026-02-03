package org.example.weather;

public class OutfitAdvisor {

    private final WeatherService weatherService;

    public OutfitAdvisor(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

    public String getClothingAdvice() {
        try {
            var temp = weatherService.getTemperature();
            if (temp < 0)
                return "Vinterjacka";
            if (temp > 15)
                return "T-Shirt";
            return null;
        } catch (IllegalStateException _) {
            return "Jeans and Jacket";
        }
    }
}
