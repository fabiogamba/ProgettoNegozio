package Negozio;

public class Negozio {
	public int prodotti[];
	public double costi[];
	public double clienti[];
	public double guadagno;
	
	public Negozio() {
		prodotti = new int[10];
		costi = new double[10];
		clienti = new double[5];
		for(int i = 0; i < prodotti.length; i++) {
			prodotti[i] = 10;
			costi[i] = 5.0 * (i + 1);
			System.out.println(costi[i]);
		}
		
		for(int i = 0; i < clienti.length; i++) {
			clienti[i] = 500.0;
		}
		
		
	}
	
	public boolean compra(int indP, int indC) {
		if(indP < 0 || indP > 9 || indC < 0 || indC > 4 || prodotti[indP] == 0 || clienti[indC] < costi[indP])
			return false;
		prodotti[indP] -= 1;
		clienti[indC] -= costi[indP];
		return true;
	}
	
	public boolean riempiProdotto(int indP) {
		if(indP < 0 || indP > 9 || prodotti[indP] == 10)
			return false;
		prodotti[indP] = 10;
		return true;
	}

}
