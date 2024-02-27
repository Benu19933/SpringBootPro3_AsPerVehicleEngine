package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("petrol")
public class PetrolEngine implements Engine {
	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}

	@Override
	public void start(String s) {
		System.out.println("petrolEngine generate more energy");
		
	}

	@Override
	public void stop(String s1) {
		System.out.println("desel engine provide more energy");
		

	}

}
