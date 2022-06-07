package Strategy;

public class COFINS implements Imposto {

	public double valor;
	
	public COFINS(double valor) {
		this.valor= valor;
	}

	public double calcular() {
		if (valor > 17000) {
		return valor = valor * 0.08;
	}
				
	return valor;
	}

}
