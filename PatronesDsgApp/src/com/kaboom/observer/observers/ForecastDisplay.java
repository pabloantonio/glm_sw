package com.kaboom.observer.observers;

import javax.security.auth.Subject;

import com.kaboom.observer.interfaces.DisplayElement;
import com.kaboom.observer.interfaces.Observer;

public class ForecastDisplay implements Observer ,DisplayElement{

	private float currentPressure = 29.92f;  
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
		currentPressure = pressure;

		display();
	}

	public void display() {
		System.out.print("Prediccion del clima: ");
		if (currentPressure > lastPressure) {
			System.out.println("El clima mejorar‡ a lo largo del d’a!");
		} else if (currentPressure == lastPressure) {
			System.out.println("M‡s de lo mismo");
		} else if (currentPressure < lastPressure) {
			System.out.println("Cuidado con la humedad, preparese para la lluvia");
		}
	}
	
	
	
	
	

}
