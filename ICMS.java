package Strategy;

public class ICMS implements Imposto {


	private double valor;
	
	public ICMS(double valor) {
		this.valor= valor;
	}
	
	public double calcular() {
		return valor * 0.30;
}

}


