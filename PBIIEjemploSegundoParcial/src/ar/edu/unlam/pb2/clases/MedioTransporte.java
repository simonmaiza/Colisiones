package ar.edu.unlam.pb2.clases;

import ar.edu.unlam.pb2.excepciones.ColitionException;

public class MedioTransporte {

	 protected static Double latitud;
	 protected static Double longitud;
	 
	public MedioTransporte(Double latitud, Double longitud) {
		super();
		this.latitud = latitud;
		this.longitud = longitud;
	}
	public Double getLatitud() {
		return latitud;
	}
	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}
	public Double getLongitud() {
		return longitud;
	}
	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}
	
	public void actualizarCoordenadas(Double latitud, Double longitud) {
		
		
	}
	 
	 
}
