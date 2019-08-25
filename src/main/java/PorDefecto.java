package main.java;

public interface PorDefecto {

	void mostrarNombre(String nombre);

	default String obtenerNombrePorDefecto(String nombre) {
		return nombre + " Por Defecto";
	}

}
