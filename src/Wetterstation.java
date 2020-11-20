

// creates instances and changes the weather
public class Wetterstation {

	public static void main(String[] args) 
	{
		Wetterdaten Otterbach = new Wetterdaten();
		Wettervorhersage Medium = new Wettervorhersage("Medium");
		
		//creating different thermometer to notify
		Thermometer schatzThermo = new Thermometer("Thermometer von Schatz");
		Thermometer kittenThermo = new Thermometer("Thermometer von Kitten");
		Thermometer drau�enThermo = new Thermometer("Thermometer von drau�en");
		
		//add them to the observable
		Otterbach.addThermo(schatzThermo);
		Otterbach.addThermo(kittenThermo);
		Otterbach.addThermo(drau�enThermo);
		
		Otterbach.addThermo(Medium);
		
		//change weather and see how every thermometer gets notified
		Otterbach.changeTemp("15");
		Otterbach.changeHumi("50");
		Otterbach.changePress("1,25");
		

	}

}
