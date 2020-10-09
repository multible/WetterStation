
public class Wetterstation {
 
	public static void main(String[] args) {
 
		// Erzeugung des Subjektes
		Wetterdaten wetterdaten = new Wetterdaten();
 
		// Erzeugung des Beobachters. Dabei wird
		// das Subjekt übergeben und registriert.
		Thermometer thermometer = new Thermometer(wetterdaten);
 
		// Zustandsänderung, Subjekt benachrichtigt
		// daraufhin die Beobachter
		wetterdaten.setTemp(33);
		wetterdaten.setWet(65);
		wetterdaten.setPressure(1);
		
		wetterdaten.setTemp(35);
		
//		System.out.println("Temperatur: " + wetterdaten.getTemp() + "C, Luftfeuchtigkeit: " + wetterdaten.getWet() + "%, Luftdruck: " + wetterdaten.getPressure() + "bar");
	}
}
