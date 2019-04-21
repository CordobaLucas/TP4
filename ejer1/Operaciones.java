package ejer1;
import java.util.Scanner;

public class Operaciones{
static Scanner teclado=new Scanner(System.in);

public static void Suma(float n1, float n2){
	float suma=n1 + n2;
	System.out.println("La suma es:"+suma);
}
public static void Resta(float n1, float n2){
	float resta=n1 - n2;
	System.out.println("La resta es:"+resta);
}
public static void Division(float n1, float n2){
	float div=n1 / n2;
	System.out.println("La division es:"+div);
}
public static void Multi(float n1,float n2){
	float multi=n1 * n2;
	System.out.println("La multiplicacion es:"+multi);
}
public static void main (String[]args){
	float n1,n2;
	System.out.print("Ingrese un numero:");
	n1=teclado.nextFloat();
	System.out.print("Ingrese otro numero:");
	n2=teclado.nextFloat();
	Suma(n1,n2);
	Resta(n1,n2);
	Division(n1,n2);
	Multi(n1,n2);
}

}
