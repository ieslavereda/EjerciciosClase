package complejo;

public class Complejo {
	private double real;
	private double imaginaria;
	
	public Complejo(){
		this.real=0;
		this.imaginaria=0;
	}
	public Complejo(double r,double i){
		this.real = r;
		this.imaginaria=i;
	}
	
	public double getReal(){
		return real;
	}
	public double getImaginaria(){
		return imaginaria;
	}
	
	public Complejo suma(Complejo c){
		return new Complejo(this.real+c.getReal(),this.imaginaria+c.getImaginaria());
	}
	
	public String toString(){
		return 	"(" + Double.toString(this.real) + "," + Double.toString(this.imaginaria) + ")";
	}
}
