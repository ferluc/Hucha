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

                Scanner scan = new Scanner(System.in);
		Hucha P = new Hucha();
		
                System.out.println("Introduce dinero");
                P.introducir(scan.nextInt());
		P.sacar(20);
                System.out.println("Introduce dinero");
		P.introducir(scan.nextInt());
		P.informar();
	}
}