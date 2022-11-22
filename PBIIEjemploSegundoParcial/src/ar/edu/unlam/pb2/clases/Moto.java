package ar.edu.unlam.pb2.clases;

import ar.edu.unlam.pb2.interfaces.IMoto;

public class Moto extends MedioTransporte implements IMoto{
	
	private String patente;
	private final Integer CAPACIDA_MAXIMA_DE_PASAJEROS;
	private Integer velocidadMaxima;

	public Moto(String patente, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.patente = patente;
		this.CAPACIDA_MAXIMA_DE_PASAJEROS = 2;
		this.velocidadMaxima = velocidadMaxima;
	}

	@Override
	public String getPatente() {
		return patente;
	}

	@Override
	public Integer getCAPACIDA_MAXIMA_DE_PASAJEROS() {
		return CAPACIDA_MAXIMA_DE_PASAJEROS;
	}

	@Override
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}
	
	

}
