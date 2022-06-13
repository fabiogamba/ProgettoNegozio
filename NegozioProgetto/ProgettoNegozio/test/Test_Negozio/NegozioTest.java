package Test_Negozio;

import static org.junit.Assert.*;

import org.junit.Test;

import Negozio.Negozio;

public class NegozioTest {

	@Test
	public void testCompra() {
		Negozio b = new Negozio();
		
		assertEquals(b.costi[0], 5.0, 0.0);
		
		//controlli su indici sbagliati
		assertFalse(b.compra(-1, 2));
		assertFalse(b.compra(11, 2));
		assertFalse(b.compra(0, 7));
		assertFalse(b.compra(0, -1));
		
		//controlli compra con indici giusti e senza errori
		assertTrue(b.compra(3, 2));	
		assertTrue(b.compra(4, 2));
		assertTrue(b.compra(9, 2));
		
		//controllo clienti[indC] < costi[indP]  
		assertFalse(b.compra(9, 2));
		
		//controllo fine prodotto
		for(int i = 0; i < 10; i++) {
			assertTrue(b.compra(1, 0));
			//System.out.println(b.clienti[0]);
		}
		assertFalse(b.compra(1, 2));
		
		
		//mutation test con PIT
		assertTrue(b.compra(0, 4));	//test per controllo sul < e >
		
		//test per controllo clienti[indC] < costi[indP] quando sono uguali
		assertTrue(b.compra(9, 3));
		assertTrue(b.compra(9, 3));
		
		//test mutation che trasfroma sottrazione in addizione
		assertEquals(b.prodotti[3], 9);
	}
	
	@Test
	public void testRiempiProdotto() {
		Negozio n = new Negozio();
		//controllo indici sbagliati
		assertFalse(n.riempiProdotto(-1));
		assertFalse(n.riempiProdotto(11));
		
		//controllo riempi prodotto gia pieno
		assertFalse(n.riempiProdotto(0));
		
		//controllo riempi prodotto venduto
		n.compra(9, 0);
		assertTrue(n.riempiProdotto(9));
		n.compra(0, 0);
		assertTrue(n.riempiProdotto(0));
		
		
		/*assertTrue(b.restituzione(3, 2));
				
		assertFalse(b.restituzione(-1, 2));
		assertFalse(b.restituzione(0, -1));
		assertFalse(b.restituzione(11, 2));
		assertFalse(b.restituzione(0, 7));
				
				
		//mutation
		//assertEquals(b.utenti[2], 2);
		//assertEquals(b.libri[3], 10);
		assertTrue(b.restituzione(0, 2));
		assertTrue(b.restituzione(5, 0));
		assertTrue(b.restituzione(9, 2));
		assertTrue(b.restituzione(5, 4));
		assertFalse(b.restituzione(4, 3));*/

				
		/*for(int i =0; i < 10; i++) {
		assertTrue(b.prestito(1, 0));
		}
		assertFalse(b.prestito(1, 2));*/
	}

}
