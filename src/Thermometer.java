
public class Thermometer implements Observer {
	
	public int newTemp = 0;
	public int newWet = 0;
	public int newPressure = 0;

	private Wetterdaten wetterdaten;

	public Thermometer(Wetterdaten wetterdaten) {
		this. wetterdaten = wetterdaten;
		
		// Durchfuehrung der Registrierung beim uebergebenen Subjekt
		this.wetterdaten.addObserver(this);
	}
	
	@Override
	public void update() {
		int newTemp = wetterdaten.getTemp();
		// ...auf neuen Status reagieren
		int newWet = wetterdaten.getWet();
		int newPressure = wetterdaten.getPressure();
		
		printTheWeather(newTemp,newWet,newPressure);
	}
	public void printTheWeather(int newTemp, int newWet, int newPressure) {
		System.out.println("Temperatur: " + newTemp + "C, Luftfeuchtigkeit: " + newWet + "%, Luftdruck: " + newPressure + "bar");
	}
}
