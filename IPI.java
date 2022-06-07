package Strategy;

public class IPI  implements Imposto {

	
private double valor;
	
	public IPI(double valor) {
		this.valor= valor;
	}
	
	public double calcular() {
		if (valor > 25000) {
		return valor = valor * 0.05;
	}
		else if (valor <= 25000) {
			return valor = valor * 0.10;
		}
	return valor;
	}


}