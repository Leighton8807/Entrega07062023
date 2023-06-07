package Gerente.procesos;
import java.util.HashMap;

import javax.swing.JOptionPane;

import Gerente.objeto.Gerente;


public class Procesos {
	HashMap<Integer, Gerente>mapGerentes;
	
	public Procesos() {
		
		mapGerentes = new HashMap<Integer, Gerente>();
		iniciar();
	}
	
	// Menu de seleccion para escoger la realización del metodo correspondiente
	private void iniciar() {
		System.out.println("Inicio exitoso");
		
		
		String menu ="GESTION DE GENRENCIA \n" ;
		menu += "1. Ingresar datos \n";
		menu += "2. Imprimir datos \n";
		menu += "3. Buscar Gerente por documento\n";
		menu += "4. Salir \n";
		
		int opc = 0;
		
		do {
			opc=Integer.parseInt(JOptionPane.showInputDialog(menu));
			crearMenu(opc);
		} while (opc!=4);
	}
	// se crea el switch case para escoger un valor en el menu y que los metodos que corresponden a cada valor se ejecuten a la hora de escoger un numero.
	private void crearMenu(int opc) {
		
		switch (opc) {
		case 1: 
			registrar();
			break;
		case 2:
			imprimirDatosGerente();
			break;
		case 3:
			buscarPorDocumento();
			break;
		case 4:
			System.out.println("Usted salió del sistema");
			break;
		default:
			System.out.println("No existe el codigo Intente de nuevo");
		}
		
	}

	
	//Se registra el gerente con sus respectivos datos
	private void registrar() {
		Gerente gerente1;
		String resp="";
		
		
		do {
			gerente1 = new Gerente();
			gerente1.ingresarDatos();
			mapGerentes.put(gerente1.getDocumento(), gerente1);
			resp = JOptionPane.showInputDialog("Ingrese SI para registrar un Gerente");
		} while (resp.equalsIgnoreCase("si"));
		
		
		
		
	}

	
	private void imprimirDatosGerente() {
		
		Gerente gerente1;
		for (int documento : mapGerentes.keySet()) {
			System.out.println(documento);
			gerente1=mapGerentes.get(documento);
			gerente1.imprimirDatos();
			System.out.println(mapGerentes.containsValue(gerente1));
			System.out.println(mapGerentes.get(gerente1));
			
		}
		System.out.println(mapGerentes);
		
	}
	// Metodo que se usa para buscar a un gerente en la estructura de datos por medio del documento que es la llave principal en el HashMap
	private void buscarPorDocumento() {
		int idConsulta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la identificacion de la mascota a consultar"));
		if (mapGerentes.containsKey(idConsulta)) {
			Gerente gerente1 = mapGerentes.get(idConsulta);
			System.out.println("El gerente está registrado en la base de datos. Su nombre es: "+ gerente1.getNombre());
			
		}else {System.out.println("El Gerente no existe o no  se encuentra registrada");
		
		}
		
	}
}
