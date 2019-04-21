package ejer2;
import java.util.Scanner;

public class Ejer2{
static Scanner teclado=new Scanner(System.in);	
	public static void Promedio(float n1,float n2,float n3){
	float promedio;
	promedio=(n1 + n2 + n3)/3;
	System.out.println("Promedio de notas: "+promedio);
	}

public static void main (String[]args)
{
	String nombre;
	float n1,n2,n3;
	System.out.print("Ingrese nombre del alumno:");
	nombre=teclado.nextLine();
	System.out.println("Ingrese las 3 notas del alumno, separadas de ENTER:");
	n1=teclado.nextFloat();
	n2=teclado.nextFloat();
	n3=teclado.nextFloat();
	System.out.println("Nombre:"+nombre);
	Promedio(n1,n2,n3);
	
}

}