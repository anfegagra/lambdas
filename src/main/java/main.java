package main.java;

public class main implements PorDefecto {

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

		Suma suma = new Suma() {
			@Override
			public int sumar(int a, int b) {
				return a + b;
			}
		};

		System.out.println(suma.sumar(2, 3));

		Suma suma1 = (a, b) -> {
			a = b * b;
			a = a + b;
			System.out.println("Imprimiendo dentro de la función lambda");
			return a;
		};

		System.out.println(suma1.sumar(2, 3));

		main lambda = new main();
		System.out.println(lambda.obtenerNombrePorDefecto("Pipe"));

	}

	@Override
	public void mostrarNombre(String nombre) {

	}
}
