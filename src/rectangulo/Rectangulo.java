package rectangulo;
import complejo.Complejo;

public class Rectangulo {
	private Complejo verticeInferiorIzquierdo;
	private Complejo verticeInferiorDerecho;
	private Complejo verticeSuperiorIzquierdo;
	private Complejo verticeSuperiorDerecho;
	
	public Rectangulo(Complejo vII,Complejo vID,Complejo vSI,Complejo vSD){
		this.verticeInferiorDerecho=vID;
		this.verticeInferiorIzquierdo=vII;
		this.verticeSuperiorDerecho=vSD;
		this.verticeSuperiorIzquierdo=vSI;
	}
	public Rectangulo(double base, double altura){
		this.verticeInferiorIzquierdo= new Complejo(0,0);
		this.verticeInferiorDerecho = new Complejo(base,0);
		this.verticeSuperiorDerecho = new Complejo(altura,base);
		this.verticeSuperiorIzquierdo = new Complejo(0,altura);
	}
	
	public double area(){
		return (verticeInferiorDerecho.getReal()-verticeInferiorIzquierdo.getReal())*(verticeSuperiorIzquierdo.getImaginaria()-verticeInferiorIzquierdo.getImaginaria());
	}
	public void desplaza(Complejo d){
		this.verticeInferiorDerecho=d.suma(this.verticeInferiorDerecho);
		this.verticeInferiorIzquierdo=d.suma(this.verticeInferiorIzquierdo);
		this.verticeSuperiorDerecho=d.suma(this.verticeSuperiorDerecho);
		this.verticeSuperiorIzquierdo=d.suma(this.verticeSuperiorIzquierdo);
	}
	
	public String toString(){
		return 	verticeSuperiorIzquierdo.toString()  + "  " + verticeSuperiorDerecho.toString()+ "\n" +
				verticeInferiorIzquierdo.toString() + "  " + verticeInferiorDerecho.toString();
	}
	
	
}
