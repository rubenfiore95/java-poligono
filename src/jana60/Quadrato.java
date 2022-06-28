package jana60;

public class Quadrato implements Poligono   {

	private double lato;

	public Quadrato (double lato){
		this.lato=lato; 
	 }
	 
	@Override
	public double area() {
		
		return lato*lato;
	}

	@Override
	public double perimetro() {
		
		return lato*4;
	}

	@Override
	public String stampa() {
		
		return "l'area del quadrato è: " + area() + " mentre il suo perimetro è: "+ perimetro();
	}

}
