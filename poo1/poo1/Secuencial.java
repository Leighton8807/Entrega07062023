package poo1;

import javax.swing.JOptionPane;

public class Secuencial {

	public static void main(String[] args) {
		
		//Se crean las variables tipo double
		double ladoA;  
		double ladoB;
		
		// Se ingresa informacion a las variables por medio de ventana de entrada.
		ladoA =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el lado A"));
		ladoB = Double.parseDouble(JOptionPane.showInputDialog( "Ingrese el lado b"));
		
		// Calculo de la informacion adquirida.
		double area;
		area = ladoA*ladoB;
		
		//impresion del resultado en la consola.
		System.out.println("El area de la cancha de futbol es: "+area);
		
		

	}

}
