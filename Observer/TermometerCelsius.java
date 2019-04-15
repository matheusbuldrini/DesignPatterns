package Observer;

public class TermometerCelsius implements Observer {
	public void update(Subject s) {
		double value = ((Temperature) s).getValue();
		System.out.println("Celsius: " + value);
	}
}