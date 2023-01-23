package actividad4;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		/*
		 * Crea un método main en el cual le preguntes al usuario que figura quiere
		 * hacer si un círculo o un cuadrado. 
		 * Después, pregunta que largo tiene ya sea
		 * el radio o el lado dependiendo de tu figura. 
		 * Por último, pregunta si desea calcular la diagonal, perímetro, área 
		 * o circunferencia dependiendo también
		 * de tu figura.
		 * */
		
		Scanner scan=new Scanner(System.in);
		try {
			System.out.println("+++++++++++Actividad 4+++++++++++");
			System.out.println("Que figura desea evaluar?");
			System.out.println("1. Cuadrado\n2. Circulo");
			int choice=scan.nextInt();
			switch(choice) {
			case 1:
				System.out.println("Cual es el largo del cuadrado?");
				float lenght=scan.nextFloat();
				CUADRADO c1=new CUADRADO(lenght);
				//
				System.out.println("Que desea calcular?\n1. Area\n2. Perimetro\n3. Diagonal");
				int calculo=scan.nextInt();
				if(calculo==1) {
					System.out.println("Area: "+ c1.impresionArea());
				}
				else if(calculo==2) {
					System.out.println("Perimetro: "+c1.impresionPerimetro());
				}
				else if(calculo==3) {
					System.out.println("Diagonal: "+c1.impresionDiagonal());
				}
				break;
				
			case 2:
				System.out.println("Cual es el radio?");
				float radio=scan.nextFloat();
				CIRCULO c2=new CIRCULO(radio);
				System.out.println("Que desea calcular?\n1. Area\n2. Circunferencia");
				calculo=scan.nextInt();
				if(calculo==1) {
					System.out.println("Area: "+ c2.impresionArea());
				}
				else if(calculo==2) {
					System.out.println("Perimetro: "+c2.impresionCircunferencia());
				}
				break;
			default:
				System.out.println("That isnt an option....");break;
			}
		}
		finally {
			scan.close();
		}
		
		
		
	}
}
