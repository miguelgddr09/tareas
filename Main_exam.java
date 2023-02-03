package primer_examen_parcial;

import java.util.Scanner;

public class Main_exam {
	
	public static void main(String[] args){
		//primera mayuscula
		
		
		//Invertir una cadena
		
		
		//vocales en mayuscula
		
		
		//FizzBuzz
		
		
		//palindromo
		
		Scanner input=new Scanner(System.in);
		String frase="anita lava la tina";
		try {
			while(true) {
				System.out.println("************Examen parcial************");
				System.out.println("1. Primera mayuscula\n2. Invertir string\n3. Vocales mayuscula\n4. FizzBuzz\n5. Palindromo\n6. Exit\n");
				int menu=input.nextInt();
				exam ex1=new exam();
				
				switch(menu) {
					
				case 1:
					System.out.println(ex1.primeraMayuscula(frase)); 
					System.out.println("");
					break;
				case 2:
					System.out.println(ex1.invertirCadena(frase));
					System.out.println("");
					break;
				case 3:
					System.out.println(ex1.vocalesMayuscula(frase));
					System.out.println("");
					break;
					
				case 4:
					ex1.fizzBuzz();
					System.out.println("");
					break;
				case 5:
					System.out.println(ex1.palindromo(frase));
					System.out.println("");
					break;
				case 6:
					
				default: 
					System.out.println("Exiting...");
					System.exit(0);
					break;
				}
			}
			
		}
		finally {
			input.close();
		}
		
	}
	
	
	
	
}
