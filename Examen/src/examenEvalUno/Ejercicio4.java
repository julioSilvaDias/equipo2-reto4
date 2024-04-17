package examenEvalUno;

import java.util.Scanner;

public class Ejercicio4 {
	
	public  static Scanner teclado = new Scanner(System.in);

	
	public static void main(String[] args) {
	
	
		int opcion;
		opcion = 0;
		do
		{	System.out.println("Menu de opciones");

		System.out.println("Opcion 1\n");
		
		System.out.println("Opcion 2\n");
		System.out.println("Opcion 3\n");
		System.out.println("Opcion 4\n");
			try {
				opcion = teclado.nextInt();
			} catch (Exception e) {
System.out.println("Error - no es un numero");
e.printStackTrace();
				return;
			}
			}
		while(opcion < 1 || opcion > 4);
		
		switch (opcion) {
	

		case 1:
			
			System.out.println("Ha seleccionado la opcion 1");
			metodo1(opcion);
			break;
		case 2:
			System.out.println("Ha seleccionado la opcion 2");
			metodo2(opcion);
			break;
		case 3:
			System.out.println("Ha seleccionado la opcion 3");
			metodo3(opcion);

			break;
		case 4:
			System.out.println("Ha seleccionado la opcion 4");
			metodo4(opcion);
			break;
		
			}
	}
	
	private  static void metodo1(int num) {
System.out.println("Ejecutando opcion " + num);
  	}
	
	private  static void metodo2(int num) {
		System.out.println("Ejecutando opcion " + num);
  	}
	
	
	private  static void metodo3(int num) {
		System.out.println("Ejecutando opcion " + num);
  	}
	
	private  static void metodo4(int num) {
		System.out.println("Ejecutando opcion " + num);
  	}
	

	
}
