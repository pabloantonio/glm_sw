package com.kaboom.observers;

import com.kaboom.observer.observers.CurrentConditionsDisplay;
import com.kaboom.observer.observers.ForecastDisplay;
import com.kaboom.observer.observers.StatisticsDisplay;
import com.kaboom.observer.observers.WeatherData;

public class WeatherStationImp {

	
	
	
	
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	}
}
