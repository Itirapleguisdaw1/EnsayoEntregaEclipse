package prueba.test;

import prueba.modelo.Saludo;

public class PruebaGitEclipse {

	
	/**
	 * PUNTO DE ENTRADA A LA APLICACIÓN
	 * @author Iñaki Ti Unai Pe Enrique La
	 * 
	 * Manoseando codigo, Unai.
	 * 
	 * 
	 * */
	public static void main(String[] args) {
		Saludo saludo = new Saludo();
		System.out.println(saludo.saludar("Juan"));
		System.out.println(saludo.saludar("Unai"));
		System.out.println(saludo.saludar("Enrique"));

	}

}
