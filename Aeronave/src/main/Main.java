package main;

import model.Aeronave;

public class Main {
	public static void main(String args[]) {
		
		Aeronave aeronave = new Aeronave();
		
		aeronave.setCor("Azul");
		aeronave.setModelo("Boeing 787");
		aeronave.setVelMax(1051);
		
		aeronave.decolar();
		aeronave.pousar();
	}
}
