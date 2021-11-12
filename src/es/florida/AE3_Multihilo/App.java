package es.florida.AE3_Multihilo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mina mina= new Mina();
		Minero minero;
		for(int i=0;i<11;i++) {
			minero= new Minero();
			Thread hilo = new Thread(minero);
			hilo.start();
		}

	}

}
