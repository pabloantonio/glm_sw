/**
 * 
 */
package com.kaboom.strategy;

import com.kabom.interfaces.FlyBehavior;
import com.kabom.interfaces.QuakBehavior;

/**
 * @author pablo
 *
 */
public abstract class Duck {
	
	
	 FlyBehavior flyBehavior;
	 QuakBehavior quakBehavior;
	
	
	
	public abstract void swim();
	public abstract void display();
	public abstract void performQuak();
	public abstract void performFly();
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}
	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}
	public QuakBehavior getQuakBehavior() {
		return quakBehavior;
	}
	public void setQuakBehavior(QuakBehavior quakBehavior) {
		this.quakBehavior = quakBehavior;
	}
	
	
	
	
	
	
	
	

}
