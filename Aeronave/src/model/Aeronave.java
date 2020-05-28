package model;

public class Aeronave {
	
	//Atributos
	private String modelo;
	private float velMax;
	private String cor;
	
	//Getters e Setters
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getVelMax() {
		return velMax;
	}
	public void setVelMax(float velMax) {
		this.velMax = velMax;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	//Métodos
	
	public void decolar() {
		System.out.println("A aeronave " + this.modelo + " está decolando!");
	}
	
	public void pousar() {
		System.out.println("A aeronave " + this.modelo + " está pousando!");
	}
	
}
