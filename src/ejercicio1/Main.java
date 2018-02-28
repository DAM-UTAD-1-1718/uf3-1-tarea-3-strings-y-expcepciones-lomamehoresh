package ejercicio1;

import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	int resultado = 0;
	
	public void Escaner(String chain) {
		char caracter = 0;
		int sumando = 0;
		for (int i = 0; i < chain.length(); i++) {
            // Determines if the specified character is a digit
            if (Character.isDigit(chain.charAt(i))) {
            	caracter = chain.charAt(i);
            	sumando = Character.getNumericValue(caracter);
                resultado = resultado + sumando;
            } 
        }
		System.out.println(resultado);	
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		Main res = new Main();
		System.out.println("Introduce una cadena");
		res.Escaner(sc.nextLine());
		
	}

}
