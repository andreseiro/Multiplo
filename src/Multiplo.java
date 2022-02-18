/**
 * 
 * @author andreseiro
 * @version 1.0 Feb 2022
 * 
 * Lee dos numero e indica si uno es multiplo del otro
 */
import java.util.Scanner;

public class Multiplo {

	public static void main(String[] args) {
		//Declaracion de variables
		int n1,n2;
		Scanner leer = new Scanner(System.in);
		
		//leer el primer número
		System.out.print("Introduce un número: "); 
		n1 = leer.nextInt();
		
		//leer el segundo número
		System.out.print("Introduce otro número: "); 
		n2 = leer.nextInt();
		
		//uso del condicional if para validar si es multiplo haciendo uso del modulo
		if (n1 % n2 == 0) {
			System.out.println("El número " + n1 + " es multiplo de " + n2);
		}
		else {
			System.out.println("No son múltiplos");
		}

	}
}