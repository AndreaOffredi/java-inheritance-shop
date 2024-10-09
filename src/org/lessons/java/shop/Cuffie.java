package org.lessons.java.shop;

public class Cuffie extends Prodotto{

	private String colore;
	private boolean wireless = false;
	
	public Cuffie(String nomeProdotto, String marcaProdotto, double prezzoProdotto, String colore, boolean wireless) {
		super(nomeProdotto, marcaProdotto, prezzoProdotto);
		this.colore = colore;
		this.colore = colore;
	}

	//GETTER E SETTER
	public String getColore() {
		return colore;
	}

	public void setColore(String colore) {
		this.colore = colore;
	}

	public boolean isWireless() {
		return wireless;
	}

	public void setWireless(boolean wireless) {
		this.wireless = wireless;
	}
	
	//CREIAMO IL METODO TOSTRING PER STAMPARE IL PRODOTTO
	@Override
	public String toString() {
		return super.toString() + ", Colore: " + colore + ", Wireless: " + (wireless ? "Sì" : "No"); //Abbreviazione condizione per scrivere SI / NO
	}
}
