package practica_unidad_6;

import java.util.*;

import javax.swing.JOptionPane;

public class Practica_entregar_ute_6 {

	
	//definimos las variables que vamos a usar dentro de la clase
	static int i;
	static int menor;
	static int mayor;
	static int numero;
	static int repe = 0;
	static int[] arrayaleatorio= new int [20];

	
	//Metodo que nos va a imprimir el valor mayor del array aleatorio
	public static void imprimirMayor() {
		mayor =0;
		for (int i = 0; i < arrayaleatorio.length; i++) {

			if (arrayaleatorio[i] > mayor) {
				mayor = arrayaleatorio[i];
				
				

			}
			
		}
		
		System.out.println("El mayor valor es: "+mayor);
	}
	
	//Metodo que nos va a imprimir el menor valor del array aleatorio
	public static void imprimirMenor() {
		menor = 10;

		for (int i = 0; i < arrayaleatorio.length; i++) {

			if (arrayaleatorio[i] < menor) {

				menor = arrayaleatorio[i];

			}
		}

		System.out.println("El menor valor es: " + menor);
	}
	
	//Metodo que nos calcula la media
	public static int imprimirMedia() {

		int media = 0;
		for (int i = 0; i < arrayaleatorio.length; i++) {

			media = media + arrayaleatorio[i];
		}

		media = media / arrayaleatorio.length;
		return media;
	}
	
	//Este metodo solo imprime los valores del array
	public static void imprimirMatriz() {

		for (int elementos : arrayaleatorio) {

			System.out.println("Los elementos del array son " + elementos+ " ");
		}
	}
	
	//este metodo imprime los valores que se repiten dentro del array
	public static void imprimeRepe() {
		numero = (int)(Math.random()*10)+1;
		repe = 0;

		for (int i = 0; i < 20; i++) {

			if (numero == arrayaleatorio[i]) { 
				repe = repe+1;			
					
		}
		}
		if (repe>0) {
		
		System.out.println("El numero" + arrayaleatorio[i] + " se repite " + repe + " veces");
		}
		else {
			System.out.println("No hay valores que se repitan");
		}

	}

	public static void main(String[] args) {

		// crear un array de 20 elementos y jugar con ellos a traves de menu
		
		for( i = 0;i<arrayaleatorio.length;i++)	{

			arrayaleatorio[i] = (int) (Math.random() * 10) + 1;
		}

		int opcion;

		do {

			System.out.println();
			System.out.println("Elige una opcion");
			System.out.println("0. Salir del prgrama");
			System.out.println("1. Imprimir el mayor valor del array");
			System.out.println("2. Imprimir el menor valor del array");
			System.out.println("3. Calcular la media de todos los valores del array");
			System.out.println("4. Imprimir todos los valores del array");
			System.out.println("5. Calcular nº de veces que se encuentra un valor repetido");
			System.out.println();

			opcion = Integer.parseInt(JOptionPane.showInputDialog("Eliga una opcion por favor"));
			switch (opcion) {

			case 1:
				System.out.println();
				imprimirMayor();
				break;

			case 2:
				imprimirMenor();
				break;

			case 3:
				System.out.println("La media es: " + imprimirMedia());
				break;

			case 4:
				imprimirMatriz();
				break;

			case 5:
				imprimeRepe();
				break;

			case 0:
				System.out.println("salir");
				break;

			default:
				System.out.println("Eliga una opcion entre '0' y '5'");

			}

		} while (opcion != 0);

	}

}
