package com.nsoft.association.limitsservice.beans;

public class LimitConfiguration {
	 int maximum;
	 int minimum;
	
	protected LimitConfiguration()
	{}
	
	public LimitConfiguration(int maximum, int minimum) {
		super();
		this.maximum = maximum;
		this.minimum = minimum;
	}
	
	
	
	public int getMaximum() {
		return maximum;
	}
	public int getMinimum() {
		return minimum;
	}
	
	
	
	
}
