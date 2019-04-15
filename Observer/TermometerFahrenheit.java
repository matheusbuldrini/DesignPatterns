package Observer;

public class TermometerFahrenheit implements Observer {
	public void update(Subject s) {
		double value = 1.8 * ((Temperature) s).getValue() + 32;
		System.out.println("Fahrenheit: " + value);
	}
}