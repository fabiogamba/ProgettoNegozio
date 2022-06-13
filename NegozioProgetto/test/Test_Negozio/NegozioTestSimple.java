package Test_Negozio;
import Negozio.Negozio;

import static org.junit.Assert.*;

import org.junit.Test;

public class NegozioTestSimple {

	@Test
	public void test() {
		Negozio b = new Negozio();
		assertFalse(b.compra(-1, 2));
		assertFalse(b.compra(11, 2));
		assertFalse(b.compra(0, 7));
		assertFalse(b.compra(0, -1));
		assertTrue(b.compra(3, 2));
		assertTrue(b.compra(4, 4));
		//mutation
		//assertEquals(b.utenti[2], 1);
		//assertEquals(b.libri[3], 9);
		//assertTrue(b.compra(0, 2));
		//assertTrue(b.compra(5, 0));
		//assertTrue(b.compra(9, 2));
		//assertTrue(b.compra(5, 4));

		
		
		//assertFalse(b.restituzione(0, 1));
		//assertFalse(b.restituzione(1, 1));
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
