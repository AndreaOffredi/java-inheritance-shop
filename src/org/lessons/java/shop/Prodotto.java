package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {

	/* 
		Lo shop gestisce diversi tipi di prodotto:
		- Smarphone, caratterizzati anche dal codice IMEI e dalla quantità di memoria
		- Televisori, caratterizzati dalle dimensioni e dalla proprietà di essere smart oppure no
		- Cuffie, caratterizzate dal colore e se sono wireless o cablate
		
		Utilizzate l’ereditarietà per riutilizzare il codice di Prodotto nella stesura delle classi che gestiscono i vari sotto tipi di prodotto.
	 * */
	
	private int codiceProdotto;
	private String nomeProdotto;
	private String marcaProdotto;
	private double prezzoProdotto;
	private double iva;
	
	public Prodotto(String nomeProdotto, String marcaProdotto, double prezzoProdotto) {
		this.nomeProdotto = nomeProdotto;
		this.marcaProdotto = marcaProdotto;
		this.prezzoProdotto = prezzoProdotto;
	}
	
	//NOME PRODOTTO
	public String getNomeProdotto() {
		return nomeProdotto;
	}

	//MARCA PRODOTTO
	public String getMarcaProdotto() {
		return marcaProdotto;
	}
	

	//PREZZO PRODOTTO
	public double getPrezzoProdotto() {
		return prezzoProdotto;
	}

	//IVA PRODOTTO
	public double getIva() {
		return iva;
	}
	
	public void setIva(double iva) {
		if(iva == 1.04 || iva == 1.22 || iva == 1.10) {
			this.iva = iva;
		}else {
			System.out.println("IVA non presente, inserisci un valore IVA valido");
		}
	}
	
	//CODICE PRODOTTO
	public int getCodiceProdotto() {
		return codiceProdotto;
	}
	
	//METODO PER CREARE CODICE RANDOMICO
	public void getCreateCode(){
		Random numeroRandomico = new Random(); //importo l'utilities per il random
		codiceProdotto = numeroRandomico.nextInt(10000); //assegno all'attributo il num random
	}
		
	//METODO CALCOLO PREZZO + IVA
	public double getPrezzoIva() {
		return prezzoProdotto * iva; //faccio ritornare al double il calcolo
	}
		
	//CREO LA STRINGA NOME+CODICE
	public String getNomeCodice() {
		return nomeProdotto + "-" + codiceProdotto; //creo concatenazione
	}
	
	//CREIAMO IL METODO TOSTRING PER STAMPARE IL PRODOTTO
	@Override
	public String toString() {
		return "Codice: " + codiceProdotto + ", Nome: " + nomeProdotto + ", Marca: " + marcaProdotto 
				+ ", Prezzo: " + prezzoProdotto + "€, IVA: " + iva + ", Prezzo Totale: " + getPrezzoIva() + "€";
	}
	
	
}
