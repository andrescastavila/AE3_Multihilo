package es.florida.AE3_Multihilo;


public class Minero implements Runnable {

	private int bolsa;
	private int tiempoExtraccion;
	
	
	public Minero() {
		bolsa=0;
		tiempoExtraccion=1000;
	}
	

	public void run() {
		extraerRecurso(bolsa,tiempoExtraccion);
	}
	
	public int getBolsa() {
		return bolsa;
	}
	
	
	
	synchronized public void extraerRecurso(int bolsa, int tiempoExtraccion) {
		Minero minero = new Minero();
		Thread t;
		for(int i=0;i<10000;i++) {
			t = new Thread(minero);
			t.setName("Minero " + (i+1));
			bolsa++;
			t.start();
		}
		try {
			Thread.sleep(tiempoExtraccion);
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Ena la bolsa hay " + bolsa+ " oros");
	}
	
}
