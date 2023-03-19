
import java.util.Scanner;
public class Java2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);

	    // solicita ao usuário a entrada de 5 números
	    System.out.println("Digite 5 números:");
	    int num1 = input.nextInt();
	    int num2 = input.nextInt();
	    int num3 = input.nextInt();
	    int num4 = input.nextInt();
	    int num5 = input.nextInt();

	    // encontra o número maior e o número menor
	    int maior = num1;
	    int menor = num1;

	    if (num2 > maior) {
	      maior = num2;
	    }
	    if (num3 > maior) {
	      maior = num3;
	    }
	    if (num4 > maior) {
	      maior = num4;
	    }
	    if (num5 > maior) {
	      maior = num5;
	    }

	    if (num2 < menor) {
	      menor = num2;
	    }
	    if (num3 < menor) {
	      menor = num3;
	    }
	    if (num4 < menor) {
	      menor = num4;
	    }
	    if (num5 < menor) {
	      menor = num5;
	    }

	    // imprime o número maior e o número menor
	    System.out.println("O número maior é: " + maior);
	    System.out.println("O número menor é: " + menor);

	    input.close();
	  }
	
	}


