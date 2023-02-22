package examen;

import static org.junit.Assert.*;

import org.junit.Test;

public class FechaTest {
	@Test public void CP1(){
		assertFalse(Fecha.validarFecha(2012, 3, 0));
	}
	@Test public void CP2(){
		assertFalse(Fecha.validarFecha(1945, 0, 1));
	}
	@Test public void CP3(){
		assertTrue(Fecha.validarFecha(2002, 6, 24));
	}
	@Test public void CP4(){
		assertTrue(Fecha.validarFecha(1998, 9, 30));
	}
}
