package controller;

import java.util.concurrent.Semaphore;

public class CorridaController extends Thread{

	public CorridaController() {
	}
	
	Semaphore semaforo;
	long tempos[] = new long[14];
	
	
	@Override
	public void run() {
		try {
			for(CarroController carro : carros) {
				semaforo.acquire();
				carro.race();
			}
		} 
		
		catch (Exception e) {
			
		}
	}

}
