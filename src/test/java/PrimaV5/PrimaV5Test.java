package PrimaV5;

import org.junit.jupiter.api.Test;

class PrimaV5Test {

	@Test
	void testIsAptoParaReduccion() {
		PrimaV5.isAptoParaReduccion(30, 1);
		PrimaV5.isAptoParaReduccion(31, 1);
		PrimaV5.isAptoParaReduccion(28, 1);
		PrimaV5.isAptoParaReduccion(28, -1);
		
	}

	@Test
	void testGetFactorEdad() {
		PrimaV5.getFactorEdad(18);
		PrimaV5.getFactorEdad(17);
		PrimaV5.getFactorEdad(25);
		PrimaV5.getFactorEdad(35);
		PrimaV5.getFactorEdad(45);
		PrimaV5.getFactorEdad(65);
		PrimaV5.getFactorEdad(90);
		PrimaV5.getFactorEdad(91);	
		PrimaV5.getFactorEdad(66);
		PrimaV5.getFactorEdad(89);
		PrimaV5.getFactorEdad(88);
		PrimaV5.getFactorEdad(64);
		PrimaV5.getFactorEdad(75);
	}

	@Test
	void testGetPuntosQuePuedePerder() {
		PrimaV5.getPuntosQuePuedePerder(18);
		PrimaV5.getPuntosQuePuedePerder(17);
		PrimaV5.getPuntosQuePuedePerder(25);
		PrimaV5.getPuntosQuePuedePerder(35);
		PrimaV5.getPuntosQuePuedePerder(45);
		PrimaV5.getPuntosQuePuedePerder(65);
		PrimaV5.getPuntosQuePuedePerder(90);
		PrimaV5.getPuntosQuePuedePerder(91);
		PrimaV5.getPuntosQuePuedePerder(66);
		PrimaV5.getPuntosQuePuedePerder(89);
		PrimaV5.getPuntosQuePuedePerder(88);
		PrimaV5.getPuntosQuePuedePerder(64);
		PrimaV5.getPuntosQuePuedePerder(75);
		
	}

	@Test
	void testGetReduccion() {
		PrimaV5.getReduccion(18);
		PrimaV5.getReduccion(17);
		PrimaV5.getReduccion(25);
		PrimaV5.getReduccion(35);
		PrimaV5.getReduccion(45);
		PrimaV5.getReduccion(65);
		PrimaV5.getReduccion(90);
		PrimaV5.getReduccion(91);
		PrimaV5.getReduccion(66);
		PrimaV5.getReduccion(89);
		PrimaV5.getReduccion(88);
		PrimaV5.getReduccion(64);
		PrimaV5.getReduccion(75);
	}
	
	@Test
	void testGetValorPrima() {
		PrimaV5.getValorPrima(500, 2.8, 50);
		PrimaV5.getValorPrima(500, -1, 0);
		PrimaV5.getValorPrima(500, 1.8, 50);
		PrimaV5.getValorPrima(500, 1.0, 100);
		PrimaV5.getValorPrima(500, 0.8, 150);
		PrimaV5.getValorPrima(500, 1.5, 200);
	}


}
