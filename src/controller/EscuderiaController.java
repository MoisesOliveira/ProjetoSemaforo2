package controller;

import java.util.concurrent.Semaphore;

public class EscuderiaController {
	
	CarroController[] carros = new CarroController[2];
	
	private static int lugar = 0;
	
	public void race() {
		long begin = System.nanoTime();
		carros[lugar].run();
		long end = System.nanoTime();
		
	}
}
