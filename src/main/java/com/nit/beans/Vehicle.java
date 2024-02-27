package com.nit.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit")
public class Vehicle {
	@Autowired
	@Qualifier("desel")
	public Engine eng;
	
	public void VehicleEngine(String s1,String s2) {
		eng.start(s1);
		System.out.println(s1+"Vehicle.VehicleEngine()");
		eng.stop(s2);
		System.out.println(s2+"Vehicle.VehicleEngine()");
		
	}

}
