package paquete.prueba01;

import org.apache.commons.lang3.StringUtils;

public class Prueba01 {
	public static void main(String[] args) {
		System.out.println(Prueba01.capitalizarPrimeraLetraOracion());
	}

	private static String imprimirCadenaVacia() {
		String cadenaVacia = StringUtils.EMPTY;
		return cadenaVacia;
	}
	
	private static String imprimirAbreviacion() {
		String curso = "Curso Java para expertos";
		return StringUtils.abbreviate(curso, 10);
	}
	
	private static String capitalizarPrimeraLetraOracion() {
		String saludo = "hola, como estas";
		return StringUtils.capitalize(saludo);
	}
	
	private static String imprimirEspacio() {
		return StringUtils.SPACE;
	}
	
	private static String imprimirSaltoLinea() {
		return StringUtils.LF;
	}
}
