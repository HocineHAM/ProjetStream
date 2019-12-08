package com.hocine.streamparalleles;

public class Facture2 {
	
	private String numero;
	private double total;
	
	public Facture2(String numero, double total) {
		super();
		this.numero = numero;
		this.total = total;
	}
	
	

	public String getNumero() {
		return numero;
	}



	public double getTotal() {
		return total;
	}



	@Override
	public String toString() {
		return "Facture2 [numero=" + numero + ", total=" + total + "]";
	}
	

}
