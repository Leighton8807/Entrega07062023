package Gerente.objeto;
import javax.swing.JOptionPane;

// Esta es la clase Gerente donde se guarda el objeto.
public class Gerente {
	
	// Variables globales privadas para encapsulación.
	private String nombre;
	private String apellido;
	private int edad;
	private int documento;
	
	
	//Constructor con parametros para asignar las respectivas variables
	public Gerente() {
		
	}

	// setter y getter para la encapsulación de las variables 
	public int getDocumento() {
		return documento;
	}


	public void setDocumento(int documento) {
		this.documento = documento;
	}


	
	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
	//Metodos
	// -- Acciones del gerente
	public void administrar(){
		System.out.println("El Gerente"+nombre+" está administrando");
	}
	
	public void hacerInforme() {
		
		System.out.println("El gerente "+nombre+" Está haciendo el informe.");
	}
	
	//Ingreso de datos por medio de interfaz grafica JOptionPane
	public void ingresarDatos() {
		
		documento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el documento del gerente"));
		nombre = JOptionPane.showInputDialog("Ingrese el nombre del gerente");
		apellido = JOptionPane.showInputDialog("Ingrese el apellido del gerente");
		edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad"));
	}
	// Se imprime la informacion almacenada de cada una de las variables
	public void imprimirDatos() {
		String mensaje="*************** DATOS GERENTE ***********\n\n";
		mensaje += "documento "+documento+"\n";
		mensaje += "Nombre: "+ nombre+", Apellido "+apellido+", Edad: "+ edad+"\n \n";
		mensaje += "*************************************************";
		System.out.println(mensaje);
		
	}
	
	
	
}
