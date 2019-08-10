/**
 * Copyright 2018, Banco Colpatria Multibanca Colpatria S.A. Digital Factory - Colpatria
 * http://www.colpatria.com
 *
 * All rights reserved Date: 8/08/2019
 */
package main.java;

public class main {

	public static void main(String[] args) {

		Persona persona = new Persona() {
			@Override
			public String obtenerNombre() {
				return "pipe";
			}
		};

		System.out.println(persona.obtenerNombre());

		Persona personaLambda = () -> "pipe lambda";

		System.out.println(personaLambda.obtenerNombre());
	}

}
