package examenEvalUno;

import java.util.Scanner;

public class Ejercicio2 {

	public  static Scanner teclado = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Menu de opciones");

		System.out.println("Opcion 1\n");
		
		System.out.println("Opcion 2\n");
		System.out.println("Opcion 3\n");
		System.out.println("Opcion 4\n");
		
		int opcion;
		do
		{	System.out.println("Menu de opciones");

		System.out.println("Opcion 1\n");
		
		System.out.println("Opcion 2\n");
		System.out.println("Opcion 3\n");
		System.out.println("Opcion 4\n");
			opcion = teclado.nextInt();}
		
		while(opcion < 1 || opcion > 4);
		
		switch (opcion) {
	

		case 1:
			
			System.out.println("Ha seleccionado la opcion 1");
			break;
		case 2:
			System.out.println("Ha seleccionado la opcion 2");
			break;
		case 3:
			System.out.println("Ha seleccionado la opcion 3");
			break;
		case 4:
			System.out.println("Ha seleccionado la opcion 4");
			break;
		
			}
	}

}
