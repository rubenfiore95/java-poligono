package jana60;

public class Triangolo implements Poligono {

	 private double base;
	 private double altezza;
	 
	 public Triangolo (double base, double altezza){
		this.base=base;
		this.altezza=altezza;
	 }
	 
	@Override
	public double area() {
		
		return (base*altezza)/2;
	}

	@Override
	public double perimetro() {
		
		return base*3;
	}

	@Override
	public String stampa() {
		
		return "l'area del triangolo è: " + area() + " mentre il suo perimetro è: "+ perimetro();
	}
}
