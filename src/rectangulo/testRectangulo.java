package rectangulo;

import complejo.Complejo;

public class testRectangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangulo r= new Rectangulo(	new Complejo(1,1),
										new Complejo(4,1), 
										new Complejo(1,3), 
										new Complejo(4,3));
		
		System.out.println(r.toString());
		System.out.println();
		
		Rectangulo r2=new Rectangulo(5,8);
		System.out.println(r2.toString());
		System.out.println();
		System.out.printf("El area del segundo rectangulo es: %s%n",r2.area());
		System.out.println();
		System.out.println("Desplazamos el rectangulo 2 (1,1)");
		System.out.println();
		r2.desplaza(new Complejo(1,1));
		System.out.println(r2.toString());
		
		
	}

}
