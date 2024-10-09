package org.lessons.java.shop;

public class Main {

		public static void main(String[] args) {
			
			//CREO I PRODOTTI CON POLIMORFISMO
			Prodotto prodotto1 = new Smartphone("iPhone15", "Apple", 1500, "AK34567PK", "128GB");
			Prodotto prodotto2 = new Televisori("Oled 4K", "LG", 2700, "65", true);
			Prodotto prodotto3 = new Cuffie("Beats", "Bose", 500, "Nero", true);
			
			//SENZA POLIMORFISMO
			Prodotto prodotto4 = new Prodotto("Galaxy S24", "Samsung", 999.99);
			prodotto4 = new Smartphone("Galaxy S24", "Samsung", 999.99, "DFGH34567", "500GB");
			
			
			//CREIAMO IL CODICE PRODOTTO PER OGNUNO
			prodotto1.getCreateCode();
			prodotto2.getCreateCode();
			prodotto3.getCreateCode();
			prodotto4.getCreateCode();
			
			//CALCOLIAMO IL PREZZO CON IVA
			prodotto1.setIva(1.22);
			prodotto2.setIva(1.04);
			prodotto3.setIva(1.10);
			prodotto4.setIva(1.22);
			
			//STAMPIAMO IL NOME ESTESO
			System.out.println(prodotto1);
			System.out.println(prodotto2);
			System.out.println(prodotto3);
			System.out.println(prodotto4);
		}
}
