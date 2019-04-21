package ejer3;

import java.util.Scanner;

public class Ejer3{
	static Scanner teclado=new Scanner(System.in);
		public static void sueldo (int horas) { 
		int sueldo;
		sueldo=horas * 400;
		System.out.print("El sueldo del trabajador es:"+sueldo);
		}
	public static void main (String []args)
	{
		int horas;
		System.out.print("Ingrese las horas que trabaja mensualmente: ");
		horas=teclado.nextInt();
		sueldo (horas);
		
	}
}