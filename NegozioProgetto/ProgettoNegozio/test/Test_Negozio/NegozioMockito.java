package Test_Negozio;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.mockito.junit.*;

import static org.junit.Assert.*;

import org.junit.Test;

import Negozio.Negozio;;

public class NegozioMockito {
	@Test
	public void test() {
		Negozio b = mock(Negozio.class);
		
		when(b.compra(1, 1)).thenReturn(true);
		assertTrue(b.compra(1, 1));
	}
	
}
