package poo1;

import javax.swing.JOptionPane;

public class UnaClaseYMetodos {

	public static void main(String[] args) {
		
		// en esta parte que es global se declaran las variables y se llaman a los metodos para el ingreso de datos y el calculo respectivo con las variables.
		double ladoA;  
		double ladoB;
		
		
		ladoA = ingresarDatos("Ingrese la longitud del lado A: ");
		ladoB = ingresarDatos("Ingrese la longitud del lado B: ");
		
		
		calcularArea(ladoA, ladoB);	
	}
	// se crea metodo para el ingreso de datos
	public static double ingresarDatos(String mensaje) {
		String cadena;
		double valor;
		
		cadena = JOptionPane.showInputDialog(null, mensaje);
		valor = Double.parseDouble(cadena);
		
		return valor;
		
	}
	// se crea metodo para el calculo de la aplicaciion
	public static void calcularArea(double ladoA, double ladoB) {
		
		double resultado;
		
		resultado=ladoA*ladoB;
		
		
		System.out.println("El resultado es: "+ resultado);
		
	}

	

}
