package PrimaV5;

public class PrimaV5 {

	public static void main(String[] args) {
		System.out.println("Programa para calculo de primas.");

		int reduccion;
		double valorPrima;
		int edad = 18;
		int puntos = 30;

		double factorEdad = getFactorEdad(edad);
		int puntosQuePuedePerder = getPuntosQuePuedePerder(edad);
		boolean aptoParaReduccion = isAptoParaReduccion(puntos, puntosQuePuedePerder);
		boolean edadPermitida = (18 <= edad && edad <= 90);
		boolean puntosEnRango = (0 <= puntos && puntos <= 30);
		boolean habilitado = (0 < puntos);

		if (edadPermitida && habilitado && puntosEnRango) {
			reduccion = aptoParaReduccion ? getReduccion(edad) : 0;
			valorPrima = getValorPrima(500, factorEdad, reduccion);
			System.out.printf("Valor prima: %.2f\n", valorPrima);
		} else {
			System.out.println("ERROR");
		}

	}

	public static boolean isAptoParaReduccion(int puntos, int puntosQuePuedePerder) {
		return ((30 - puntosQuePuedePerder) <= puntos && puntos <= 30);
	}

	public static double getFactorEdad(int edad) {
		double v;// value
		if (18 <= edad && edad < 25)
			v = 2.8;
		else if (25 <= edad && edad < 35)
			v = 1.8;
		else if (35 <= edad && edad < 45)
			v = 1.0;
		else if (45 <= edad && edad < 65)
			v = 0.8;
		else if (65 <= edad && edad <= 90)
			v = 1.5;
		else
			v = -1;// when wrong input
		return v;
	}

	public static int getPuntosQuePuedePerder(int edad) {
		int v;// value
		if (18 <= edad && edad < 25)
			v = 1;
		else if (25 <= edad && edad < 35)
			v = 3;
		else if (35 <= edad && edad < 45)
			v = 5;
		else if (45 <= edad && edad < 65)
			v = 7;
		else if (65 <= edad && edad <= 90)
			v = 5;
		else
			v = -1;// when wrong input
		return v;
	}

	public static int getReduccion(int edad){       
		int v;//value
		if( 18 <= edad && edad < 25 ) v = 50;
		else if( 25 <= edad && edad < 35 ) v = 50;
		else if( 35 <= edad && edad < 45 ) v = 100;
		else if( 45 <= edad && edad < 65 ) v = 150;
		else if( 65 <= edad && edad < 90 ) v = 200;
		else v =-1;//when wrong input
		return v;
	}

	public static double getValorPrima( int tarifaBasica, double factorEdad, int reduccionConductorSeguro){
		return tarifaBasica * factorEdad - reduccionConductorSeguro;
	}


}
