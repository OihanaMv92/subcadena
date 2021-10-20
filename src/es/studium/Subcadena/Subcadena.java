package es.studium.Subcadena;

import java.util.Scanner;

public class Subcadena
{

	public static void main(String[] args)
	{
		String cadena;
		int posicion, longitud;
		
		Scanner teclado = new Scanner(System.in);
		System.out.println("Dame una cadena");
		cadena = teclado.nextLine();
		System.out.println("Dame una posición");
		posicion = teclado.nextInt();
		do {
			System.out.println("Dame la longitud");
			longitud = teclado.nextInt();
		}while(posicion + longitud > cadena.length());
		
		teclado.close();
		
		System.out.println("La subcadena es: '" + subcadena(cadena,posicion,longitud) + "'");
	}
	
	public static String subcadena(String f, int p, int l) {
		String resultado = "";
		for(int i=p;i<(p+l);i++) {
			resultado = resultado + f.charAt(i);
		}
		return resultado;
	}

}