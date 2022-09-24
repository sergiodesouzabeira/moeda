package ConversorDeMoedas;

import javax.swing.JOptionPane;

public class FuncaoConverter {

	
	
	public void ConverterReaisParaDolar(double valorRecebido) {
		double moedaDolar = valorRecebido / 5.26;
		moedaDolar = (double) Math.round(moedaDolar * 100d)/100;
		JOptionPane.showMessageDialog(null, "Voce tem $" + moedaDolar + "Dolares");
	}
	
	public void ConverterReaisParaEuro(double valorRecebido) {
	double moedaEuro = valorRecebido / 5.10;
	moedaEuro = (double) Math.round(moedaEuro * 100d)/100;
	JOptionPane.showMessageDialog(null, "Voce tem €" + moedaEuro + "Euro");
	}
	public void converterReaisParaLibras(double valorRecebido){
        double moedaLibra = valorRecebido / 5.72;
        moedaLibra = (double) Math.round(moedaLibra * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaLibra + " Libras Esterlinas");
    }

    public void converterReaisParaPesosArgentinos(double valorRecebido){
        double moedaPesoArgentino = valorRecebido / 0.036;
        moedaPesoArgentino = (double) Math.round(moedaPesoArgentino * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoArgentino + "Pesos Argentinos");
    }

    public void converterReaisParaPesosChilenos(double valorRecebido){
        double moedaPesoChileno = valorRecebido / 0.0040;
        moedaPesoChileno = (double) Math.round(moedaPesoChileno * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Você tem $ " + moedaPesoChileno + " Pesos Chilenos");
    }
	
	public double converterCelsiusParaFahrenheit(double valorRecebido) {
        double celsiusParaFahrenheit = valorRecebido * 1.8 + 32;
        celsiusParaFahrenheit = (double) Math.round(celsiusParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + celsiusParaFahrenheit + " Graus Fahrenheit ");
        return celsiusParaFahrenheit;
    }

    public double converterCelsiusParaKelvin(double valorRecebido) {
        double celsiusParaKelvin = valorRecebido + 273.15;
        celsiusParaKelvin = (double) Math.round(celsiusParaKelvin * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Celsius são " + celsiusParaKelvin + " Kelvin");
        return celsiusParaKelvin;
    }

    public double converterFahrenheitParaCelsius(double valorRecebido) {
        double fahrenheitParaCelsius = (valorRecebido - 32) / 1.8;
        fahrenheitParaCelsius = (double) Math.round(fahrenheitParaCelsius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Graus Fahrenheit são " + fahrenheitParaCelsius + " Celsius");
        return fahrenheitParaCelsius;
    }

    public double converterKelvinParaCelsius(double valorRecebido) {
        double kelvinParaCelcius = valorRecebido - 273.15;
        kelvinParaCelcius = (double) Math.round(kelvinParaCelcius * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são " + kelvinParaCelcius + " Celsius");
        return kelvinParaCelcius;
    }

    public double converterKelvinParaFahrenheit(double valorRecebido) {
        double kelvinParaFahrenheit = (valorRecebido - 273.15) * 9 / 5 + 32;
        kelvinParaFahrenheit = (double) Math.round(kelvinParaFahrenheit * 100d) / 100;
        JOptionPane.showMessageDialog(null, valorRecebido + " Kelvin são " + kelvinParaFahrenheit + " Fahrenheit");
        return kelvinParaFahrenheit;
    }
}
