package com.kaboom.strategy;

import com.kaboom.interfacesImp.FlyWithWings;
import com.kaboom.interfacesImp.Quack;

public class DuckHunt extends Duck {
	
	
	
	public DuckHunt(){
		display();
		flyBehavior = new FlyWithWings();
		quakBehavior = new Quack();
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		System.out.println("Lo siento no fui dise–ado para nadar.");
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Hola soy Duck Hunt ...");
	}

	@Override
	public void performQuak() {
		// TODO Auto-generated method stub
		quakBehavior.quak();
	}

	@Override
	public void performFly() {
		// TODO Auto-generated method stub
		flyBehavior.fly();
	}
	
	
	

}
