package ejercicio4;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws NoNumero {
		// TODO Auto-generated method stub
		Main yomismo = new Main();
		int i = 0;
		try {
			System.out.println(yomismo.sumaCinco());
		} catch (NoNumero ex) {
			System.out.println(ex.getMessage());
		}
	}

	class NoNumero extends Exception {
		public NoNumero() {
			super();
		}

		public NoNumero(String msg) {
			super(msg);
		}
	}

	int sumaCinco() throws NoNumero {

		Scanner in = new Scanner(System.in);
		int resultado = 0;
		int numero = 0;
		
		int i = 0;
		while (i<5) {
			if (!in.hasNextInt()) {
				throw new NoNumero("Introduzca un numero");
				
			} else {
				numero=in.nextInt();
				resultado += numero;
			}
			i++;
		}
			 
			
		
		return resultado;

	}
}
