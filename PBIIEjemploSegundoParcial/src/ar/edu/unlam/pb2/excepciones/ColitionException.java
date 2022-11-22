package ar.edu.unlam.pb2.excepciones;

public class ColitionException extends Exception {

	private String mensaje;

	public ColitionException(String mensaje) {
		this.mensaje = mensaje;
	}

	
}
