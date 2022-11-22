package ar.edu.unlam.pb2.clases;

import ar.edu.unlam.pb2.interfaces.IAuto;

public class Auto extends MedioTransporte implements IAuto{
	private String patente;
	private Integer cantidadMaximaDePasajeros;
	private Integer velocidadMaxima;

	public Auto(String patente, Integer cantidadMaximaDePasajeros, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.cantidadMaximaDePasajeros = cantidadMaximaDePasajeros;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String getPatente() {
		 return patente;
	}

	@Override
	public Integer getCantidadMaximaDePasajeros() {
		return cantidadMaximaDePasajeros;	
	}

	@Override
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;	
	}

	




}
