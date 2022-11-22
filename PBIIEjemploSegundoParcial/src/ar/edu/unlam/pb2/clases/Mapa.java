package ar.edu.unlam.pb2.clases;

import java.util.HashSet;
import java.util.Set;
import ar.edu.unlam.pb2.excepciones.ColitionException;

public class Mapa extends MedioTransporte {

	private String ciudad;
	public Set<MedioTransporte> listaVehiculos;

	public Mapa(String ciudad) {
		super(latitud, longitud);
		this.ciudad = ciudad;
		this.listaVehiculos = new HashSet<MedioTransporte>();
	}

	public Set<MedioTransporte> getListaVehiculos() {
		return listaVehiculos;
	}

	public void setListaVehiculos(Set<MedioTransporte> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}

	public void agregarVehiculo(MedioTransporte auto) {
		this.listaVehiculos.add(auto);
	}

	public Integer getCantidadDeVehiculos() {
		return this.listaVehiculos.size();
	}

	public Boolean hayCoalición(MedioTransporte auto) throws ColitionException {
		for (MedioTransporte it : listaVehiculos) {
			if (it.getLatitud().equals(auto.getLatitud()) && it.getLongitud().equals(auto.getLongitud())) {
				throw new ColitionException("Choque");
			}
		}

		return true;
	}

}
