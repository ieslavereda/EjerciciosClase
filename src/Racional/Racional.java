package Racional;

public class Racional {
	private int numerador;
	private int denominador;
	
	public Racional(){
		numerador = 0;
		denominador = 0;
	}	
	public Racional(int numerador,int denominador){
		this.numerador=numerador;
		this.denominador=denominador;
	}	
	public Racional suma(Racional r){
		return new Racional(this.numerador*r.getDenominador()+r.getNumerador()*this.denominador,this.denominador*r.getDenominador());
	}
	public Racional resta(Racional r){
		return new Racional(this.numerador*r.getDenominador()-r.getNumerador()*this.denominador,this.denominador*r.getDenominador());
	}
	public Racional multiplicacion(Racional r){
		return new Racional(this.numerador*r.getNumerador(),this.denominador*r.getDenominador());
	}
	public String comparadoCon(Racional r){
		String resultado;
		
		if(this.numerador*r.getDenominador()>r.getNumerador()*this.denominador){
			resultado = "Mayor";
		} else if(this.numerador*r.getDenominador()==r.getNumerador()*this.denominador){
			resultado = "Iguales";
		} else {
			resultado = "Menor";
		}		
		return resultado;
	}
	public Racional copia(){
		return new Racional(numerador,denominador);
	}
	
	// Getters
	public int getNumerador(){
		return numerador;
	}
	public int getDenominador(){
		return denominador;
	}
	// Setters
	public void setNumerador(int numerador){
		this.numerador=numerador;
	}
	public void setDenominador(int denominador){
		this.denominador=denominador;
	}
		
	public String toString(){
		return Integer.toString(numerador) + "/" + Integer.toString(denominador)+"\n";
	}
}
