package clasesAyuda;

public class Monedas {
	private double MonedadeCambio;
	private double Dolar= 16.84;
	private double Euro= 18.65;
	private double LibraE= 21.59;
	private double YenJ= 0.12;
	private double WonSC= 0.013;
	
	//Setters y Getters de las diferentes monedas
	
	public double getMonedadeCambio() {
		return MonedadeCambio;
	}
	public void cargarCantidad(double cantidad) {
		this.MonedadeCambio = cantidad;
	}
	public double getDolar() {
		return Dolar;
	}
	public double getEuro() {
		return Euro;
	}
	public double getLibraE() {
		return LibraE;
	}
	public double getYenJ() {
		return YenJ;
	}
	public double getWonSC() {
		return WonSC;
	}
	
	//Conversores de Peso Mexicano a Moneda internacional
	
	
	public double pesoMaMonedaExt(int menu) {
		double resultado =0;
		System.out.println(menu);
		switch(menu) {
			case 1:
				resultado = this.MonedadeCambio / this.Dolar;
				break;
			case 2:
				resultado = this.MonedadeCambio / this.Euro;
				break;
			case 3:
				resultado = this.MonedadeCambio / this.LibraE;
				break;
			case 4:
				resultado = this.MonedadeCambio / this.YenJ;
				break;
			case 5:
			resultado = this.MonedadeCambio / this.WonSC;
				break;
			case 6:
				resultado = this.MonedadeCambio * this.Dolar;
				break;
			case 7:
				resultado = this.MonedadeCambio * this.Euro;
				break;
			case 8:
				resultado = this.MonedadeCambio * this.LibraE;
				break;
			case 9:
				System.out.println("hola "+this.MonedadeCambio);
				resultado = this.MonedadeCambio * this.YenJ;
				break;
			case 10:
				resultado = this.MonedadeCambio * this.WonSC;
				break;
			default:					
		}
		return resultado;
	}
	
}
