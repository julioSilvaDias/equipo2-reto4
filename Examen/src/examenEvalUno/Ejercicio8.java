package examenEvalUno;

import java.util.Scanner;

public class Ejercicio8 {

	public  static Scanner teclado = new Scanner(System.in);

	
	public static void main(String[] args) {
	
	
		int opcion;
		opcion = 0;
		double precio = 12.35;
		int iva = 21;
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
			System.out.println(metodo4(precio, iva, opcion));
			break;
		
			}
	}
	
	private  static void metodo1(int num) {
		int op1, op2;
		
System.out.println("Ejecutando opcion " + num);
System.out.println("Dime op1");
op1 =  teclado.nextInt();
System.out.println("Dime op2");
op2 =  teclado.nextInt();
System.out.println("Op1 + Op2 = " + (op1 + op2));
System.out.println("Op1 - Op2 = " + (op1 - op2));
System.out.println("Op1 * Op2 = " + (op1 * op2));
if(op2 == 0)
		System.out.println("División por 0");
else
	System.out.println("Op1 / Op2 = " + (op1 / op2));


  	}
	
	private  static void metodo2(int num) {
		float op1 = 0;
		int aux;
		
		System.out.println("Ejecutando opcion " + num);
		System.out.println("Dime op1");
		//op1 = float.parseFloat()
		op1 =  teclado.nextFloat();
		aux = (int) op1;
		System.out.println(aux);
		System.out.println(op1 - aux);

		
		
		
  	}
	
	
	private  static void metodo3(int num) {
		System.out.println("Ejecutando opcion " + num);
		
		String[] productos = {"", "","", "",""};
		
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Dime un producto");
			productos[i] = teclado.next();
		}
		for(int i = 0; i < 5; i++)
		{
			System.out.println("Producto [" + i + "]" + productos[i]);
		}
		
  	}
	
	private  static double metodo4(double precio, int iva,int num) {
		System.out.println("Ejecutando opcion " + num);
		
		precio = precio * (iva/100);
		
		return precio;
		
		
  	}
	

	
}