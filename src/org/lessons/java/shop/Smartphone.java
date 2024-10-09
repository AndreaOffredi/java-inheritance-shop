package org.lessons.java.shop;

public class Smartphone extends Prodotto{

	private String imeiProdotto;
	private String memoriaGB;
	
	public Smartphone( String nomeProdotto, String marcaProdotto, double prezzoProdotto, String imeiProdotto, String memoriaGB) {
		super(nomeProdotto, marcaProdotto, prezzoProdotto);
		this.imeiProdotto = imeiProdotto;
		this.memoriaGB = memoriaGB;
	}

	//GETTER E SETTER
	public String getImeiProdotto() {
		return imeiProdotto;
	}

	public void setImeiProdotto(String imeiProdotto) {
		this.imeiProdotto = imeiProdotto;
	}

	public String getMemoriaGB() {
		return memoriaGB;
	}

	public void setMemoriaGB(String memoriaGB) {
		this.memoriaGB = memoriaGB;
	}
	
	//CREIAMO IL METODO TOSTRING PER STAMPARE IL PRODOTTO
	@Override
	public String toString() {
		return super.toString() + ", IMEI: " + imeiProdotto + ", Memoria: " + memoriaGB;
	}
	
}
