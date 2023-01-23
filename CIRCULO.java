package actividad4;

public class CIRCULO {
	
	public double radio;
	
	
	public CIRCULO(double radio) {
		this.radio = radio;
	}
	public double impresionCircunferencia() {
		double pi=(double)Math.PI;
		double circunferencia = (2*pi)*radio;
		return circunferencia;
	}
	public double impresionArea() {
		double pi=(double) Math.PI;
		double area=pi*((double)Math.pow(radio, 2));
		return area;
	}
}
