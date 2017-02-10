package Racional;

public class EjemploRacional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Racional r1=new Racional(1,3);
		Racional r2=new Racional(1,2);
		Racional r3 = r1.copia();;
		
		System.out.println("R1 --------> " + r1.toString());
		System.out.println("R2 --------> " + r2.toString());
		System.out.println("R1 + R2 ---> " + r1.suma(r2).toString());
		System.out.println("R1 - R2 ---> " + r1.resta(r2).toString());
		System.out.println("R1 * R2 ---> " + r1.multiplicacion(r2).toString());
		System.out.println("R1 comparado con R2 es "+ r1.comparadoCon(r2));
		System.out.println("R3 --------> " + r3.toString());
		

		
	}

}
