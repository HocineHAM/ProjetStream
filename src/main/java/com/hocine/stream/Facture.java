package com.hocine.stream;

public class Facture {
	private String numero;
	private double total;
	private String client;
	
	public String getNumero() {return numero;}
	public double getTotal() {return total;}
	public String client() {return client;}
	public Facture(String numero, double total, String client) {
		
		this.numero = numero;
		this.total = total;
		this.client = client;
	}
	@Override
	public String toString() {
		return "Facture [numero=" + numero + ", total=" + total + ", client=" + client + "]";
	}
	

}
