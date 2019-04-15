package Observer;

public class TesteTemperature {
	public static void main(String[] args) {
		Temperature t = new Temperature();
		t.addObserver(new TermometerCelsius());
		t.addObserver(new TermometerFahrenheit());
		t.setValue(100);
		t.setValue(0);
	}
}
