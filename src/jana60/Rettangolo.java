package jana60;

public class Rettangolo implements Poligono   {

	 private double base;
	 private double altezza;
	 
	 public Rettangolo (double base, double altezza){
		this.base=base;
		this.altezza=altezza;
	 }
	 
	@Override
	public double area() {
		
		return base* altezza;
	}

	@Override
	public double perimetro() {
		
		return (base*altezza)*2;
	}

	@Override
	public String stampa() {
		
		return "l'area del rettangolo è: " + area() + " mentre il suo perimetro è: "+ perimetro();
	}

}
