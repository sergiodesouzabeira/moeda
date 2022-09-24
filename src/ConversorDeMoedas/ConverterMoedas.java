package ConversorDeMoedas;
import javax.swing.JOptionPane;


public class ConverterMoedas {

		
	public static void main(String[] args) {
	
		FuncaoConverter converter = new FuncaoConverter();
		
			while(true) {
				String opcao = JOptionPane.showInputDialog(null, "Escolha a opcao " , "Menu" , JOptionPane.PLAIN_MESSAGE ,null, new Object[] {"Conversor de Moeda", "Conversor de Temperatura" }, "Escolha").toString();
			switch(opcao) {				
				case "Conversor de Moeda":
					String input = JOptionPane.showInputDialog(null, "Tipo de moeda" , "Menu" , JOptionPane.PLAIN_MESSAGE ,null, new Object[] {"Dolar" ,"Euro","Libras","Pesos Argentinos"}, "Escolha").toString();
					switch(input) {
					
					case "Dolar":
					String input1 = JOptionPane.showInputDialog("reais para Dolar");
					double valorRecebido1 = Double.parseDouble(input1);
					converter.ConverterReaisParaDolar(valorRecebido1);
							break;
					case "Euro":					
						String input2 = JOptionPane.showInputDialog("reais para euro");
						double valorRecebido2 = Double.parseDouble(input2);
						converter.ConverterReaisParaEuro(valorRecebido2);
								break;
					case "Libras":					
						String input3 = JOptionPane.showInputDialog("reais para Libra");
						double valorRecebido3 = Double.parseDouble(input3);
						converter.converterReaisParaLibras(valorRecebido3);
								break;
					case "Pesos Argentinos":					
						String input4 = JOptionPane.showInputDialog("reais para Pesos Argentinos");
						double valorRecebido4 = Double.parseDouble(input4);
						converter.converterReaisParaPesosArgentinos(valorRecebido4);
								break;
					}
					case "Conversor de Temperatura":	
						String input5 = JOptionPane.showInputDialog(null, "Tipo de Temperatura" , "Menu" , JOptionPane.PLAIN_MESSAGE ,null, new Object[] {"Celsius para Fahrenheit" ,"Celsius para Kelvin","Fahrenheit para Celsius","Kelvin para Celsius"}, "Escolha").toString();
						switch(input5) {
						
						case "Celsius para Fahrenheit":
						String input6 = JOptionPane.showInputDialog("Celsius para Fahrenheit");
						double valorRecebido6 = Double.parseDouble(input6);
						converter.converterCelsiusParaFahrenheit(valorRecebido6);
								break;
								
						case "Celsius para Kelvin":
							String input7 = JOptionPane.showInputDialog("Celsius para Kelvin");
							double valorRecebido7 = Double.parseDouble(input7);
							converter.converterCelsiusParaKelvin(valorRecebido7);
									break;
						
						case "Kelvin para Celsius":
							String input8 = JOptionPane.showInputDialog("Kelvin para Celsius");
							double valorRecebido8 = Double.parseDouble(input8);
							converter.converterKelvinParaCelsius(valorRecebido8);
									break;
						
						case "Fahrenheit para Celsius":
							String input9 = JOptionPane.showInputDialog("Fahrenheit para Celsius");
							double valorRecebido9 = Double.parseDouble(input9);
							converter.converterFahrenheitParaCelsius(valorRecebido9);
									break;			
				}
			}
		}	
	}
}			

	
	
	
	