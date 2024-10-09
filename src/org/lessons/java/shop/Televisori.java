package org.lessons.java.shop;

public class Televisori extends Prodotto {
	
	private String polliciTV;
	private boolean smartTV = false;
	
	public Televisori(String nomeProdotto, String marcaProdotto, double prezzoProdotto, String polliciTV, boolean smartTV) {
		super(nomeProdotto, marcaProdotto, prezzoProdotto);
		this.polliciTV = polliciTV;
		this.smartTV = smartTV;
	}

	//GETTER E SETTER
	public String getPolliciTV() {
		return polliciTV;
	}

	public void setPolliciTV(String polliciTV) {
		this.polliciTV = polliciTV;
	}

	public boolean isSmartTV() {
		return smartTV;
	}

	public void setSmartTV(boolean smartTV) {
		this.smartTV = smartTV;
	}
	
	//CREIAMO IL METODO TOSTRING PER STAMPARE IL PRODOTTO
	@Override
	public String toString() {
		return super.toString() + ", Pollici: " + polliciTV + ", SmartTV: " + (smartTV ? "Sì" : "No"); //Abbreviazione condizione per scrivere SI / NO
	}
}
