package com.nit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nit.beans.Vehicle;

@SpringBootApplication
public class SpringBootPro3AsPerVehicleEngineApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringBootPro3AsPerVehicleEngineApplication.class, args);
		Vehicle v=ctx.getBean("vehicle",Vehicle.class);
		v.VehicleEngine("delhi","kanyakumari");
	}

}
