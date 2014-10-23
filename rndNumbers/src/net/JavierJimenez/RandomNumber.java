/**
 * 
 */
package net.JavierJimenez;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

/**
 * @author surrui
 *
 */
public class RandomNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		long time_start, time_end;

		time_start = System.currentTimeMillis();

		Scanner lector = new Scanner(System.in);

		Random rnd = new Random();

		int[] randomArray = new int[500000];

		for (int i = 0; i < randomArray.length; i++) {

			randomArray[i] = rnd.nextInt(500000) + 1;

		}

		Arrays.sort(randomArray);

		System.out.print("Escriu un valor enter que es trobi entre 1 i 500000: ");

		int valor = lector.nextInt();

		System.out.println();

		boolean found = false;

		int j = 0;
		
		while (!found && j != randomArray.length - 1) {

			int random = randomArray[j];
			
			if(random == valor){
				
				found = true;
				
			} else {
				
				j++;
				
			}			
		}
		
		if (found == true){
			
			System.out.println("El valor " + valor + " es troba dins l'array.");
			System.out.println();
			
		} else {
			
			System.out.println("El valor " + valor + " no es troba dins l'array.");
			System.out.println();
			
		}
		
		lector.close();
		
		time_end = System.currentTimeMillis();

		long total_Time = time_end - time_start;

		System.out.println("El programa ha trigar " + total_Time + " milisegons");
	}

}
