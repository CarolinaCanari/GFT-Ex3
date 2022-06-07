package Strategy;

public class Main {

	public static void main(String[] args) {
		CalculadoraDeImposto calculadora = new CalculadoraDeImposto();
		
		ICMS icms = new ICMS(10000.0);
		IPI ipi = new IPI(100000);
		COFINS cofins = new COFINS(10000.0);
		
		System.out.print("digite o valor: 10000");
		System.out.println(calculadora.calcular(icms));
		System.out.println(calculadora.calcular(ipi));
		System.out.println(calculadora.calcular(ipi));

	}

}


