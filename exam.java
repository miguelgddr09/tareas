package primer_examen_parcial;

public class exam {

	public String primeraMayuscula(String frase) { 
		String cap=frase.substring(0,1).toUpperCase();
		String fraseMayus=cap+frase.substring(1);
		return fraseMayus;
	}
	
	public String invertirCadena(String frase) {
		String fraseInv="";
		for(int i=0; i<frase.length(); i++ ) {
			fraseInv=frase.charAt(i)+fraseInv;
		}
		return fraseInv;
	}
	
	public String vocalesMayuscula(String frase) {
		
		String conVM=frase.replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U");
		
		return conVM;
	}
	
	public void fizzBuzz() {
				
		for(int i=1; i<=100; i++) {
			if(i % 5 == 0 && i % 3 == 0) {
				System.out.println("FizzBuzz");
			}
			else if(i % 3 == 0) {
				System.out.println("Fizz");
			}
			else if(i % 5 == 0) {
				System.out.println("Buzz");
			}
			
		}
		
		
	}
	
	public boolean palindromo(String frase) {
		
		boolean ans=false;
		String initialStr=frase.replaceAll("\\s","").toLowerCase();
		String rev="";
		
		//creates new string and reverses the initial one
		for(int i=initialStr.length()-1; i>=0; i--) {
			rev+=initialStr.charAt(i);
		}
		
		//check if they are equal
		
		if(initialStr.equals(rev)) {
			ans=true;
		}
		
		return ans;
	}
	
}
