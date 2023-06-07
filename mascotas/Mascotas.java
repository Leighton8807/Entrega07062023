package mascotas;

import javax.swing.JOptionPane;

public class Mascotas {
	
	private Integer id;
	private String especie;
	private String raza;
	private String nombre;
	private int edad;
	
	
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public void setId(Integer id){
		this.id = id;
	}
	
	public Integer getId(){
		return id;
	}
	
	
	public Mascotas(){
		
			
		
	}
	

	
	public void despertar() {
		System.out.println("El "+ especie+" Despierta");
	}
	
	public void caminar() {
		System.out.println("El "+especie+" Camina");
	}
	
	public void comer() {
		System.out.println("El "+especie+" Come");
	}
	
	public void emitirSonido() {
		
		if (especie.equalsIgnoreCase("perro")) {
			System.out.println("¡Guau guau!");
			} else if (especie.equalsIgnoreCase("gato")) {
			System.out.println("El"+ nombre+ " maulla: \"Rauuuuull!!!!\"");
			} else {
			System.out.println("La mascota no hace sonidos conocidos.");
			}

	
	}

	public void imprimirDatos() {
		String mensaje="*************** DATOS MASCOTA ***********\n\n";
		mensaje += "id "+id+", Especie: "+ especie+", Raza: "+raza+"\n";
		mensaje += "Nombre: "+ nombre+", Edad: "+ edad+"\n \n";
		mensaje += "*************************************************";
		System.out.println(mensaje);
	}

	public void ingresarDatos() {
		id=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion de la mascota"));
		nombre=JOptionPane.showInputDialog("Ingrese el nombre de la mascota");
		especie=JOptionPane.showInputDialog("Ingrese la especie de la mascota");
		raza=JOptionPane.showInputDialog("Ingrese la raza de la mascota");
		edad=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la mascota"));
	}
	
}
