package com.nit.beans;

import org.springframework.stereotype.Component;

@Component("desel")
public class DeselEngine implements Engine {
	
public DeselEngine() {
	System.out.println("DeselEngine.DeselEngine()");
}
	
	@Override
	public void start(String s1) {
		System.out.println("DeselEngine.start()"+s1);

	}

	@Override
	public void stop(String s2) {
		System.out.println("DeselEngine.stop()"+s2);

	}

}
