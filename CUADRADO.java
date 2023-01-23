package actividad4;

//TODO this does not work correctly w numbers as long as my ID number
public class CUADRADO {

	public float num;

	public CUADRADO(float num) {
		this.num=num;
	}
	
	public double impresionArea() {
		double area=(double) Math.pow(num, 2);
		return area;
	}
	public double impresionPerimetro() {
		double perimetro=num*4;
		return perimetro;
	}
	public double impresionDiagonal() {
		double area=(double) Math.pow(num, 2);
		double diagonal=(double) Math.sqrt(area+area);
		return diagonal;
	}
	
	
	
	
}