import java.util.*;
public class Hucha {
	
	int saldo=0;

	public void introducir(int a) {
		saldo+=a;                           
	}
	public void sacar(int a){
		saldo-=a;
	}
	public void informar(){
		System.out.println("Tu saldo es: " + saldo);
	}

	public static void main(String[] args) {

		Hucha P = new Hucha();
		
		P.introducir(50);
		P.sacar(20);
		P.introducir(40);
		P.informar();
	}
}