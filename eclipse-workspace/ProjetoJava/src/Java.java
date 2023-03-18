
import java.util.Scanner;
public class Java {
		
		   public static void main(String[] args) {
		      Scanner input = new Scanner(System.in);

		      int[] numeros = new int[5];
		      int pares = 0, impares = 0, soma = 0;

		      for (int i = 0; i < numeros.length; i++) {
		         System.out.print("Digite o " + (i+1) + "º número: ");
		         numeros[i] = input.nextInt();

		         if (numeros[i] % 2 == 0) {
		            pares++;
		         } else {
		            impares++;
		         }

		         soma += numeros[i];
		      }

		      double media = soma / (double) numeros.length;

		      System.out.println("Números pares:");
		      for (int i = 0; i < numeros.length; i++) {
		         if (numeros[i] % 2 == 0) {
		            System.out.println(numeros[i]);
		         }
		      }

		      System.out.println("Números ímpares:");
		      for (int i = 0; i < numeros.length; i++) {
		         if (numeros[i] % 2 != 0) {
		            System.out.println(numeros[i]);
		         }
		      }

		      System.out.println("Média: " + media);
		      System.out.println("Quantidade de pares: " + pares);
		      System.out.println("Quantidade de ímpares: " + impares);

		      input.close();
		   }
		

	}


