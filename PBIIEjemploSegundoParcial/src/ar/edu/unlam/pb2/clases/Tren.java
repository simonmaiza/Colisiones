package ar.edu.unlam.pb2.clases;

import ar.edu.unlam.pb2.interfaces.ITren;

public class Tren extends MedioTransporte implements ITren{
	
	private Integer cantidadDeVagones;
	private Integer cantidadDePasajerosPorVagon;
	private Integer velocidadMaxima;

	public Tren(Integer cantidadDeVagones, Integer cantidadDePasajerosPorVagon, Integer velocidadMaxima, Double latitud, Double longitud) {
		super(latitud, longitud);
		this.cantidadDeVagones = cantidadDeVagones;
		this.cantidadDePasajerosPorVagon = cantidadDePasajerosPorVagon;
		this.velocidadMaxima = velocidadMaxima;
		
	}

	@Override
	public Integer getCantidadDeVagones() {
		return cantidadDeVagones;
	}

	@Override
	public Integer getCantidadDePasajerosPorVagon() {
		return cantidadDePasajerosPorVagon;
	}

	@Override
	public Integer getVelocidadMaxima() {
		return velocidadMaxima;
	}

}
