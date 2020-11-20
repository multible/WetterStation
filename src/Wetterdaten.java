import java.util.List;
import java.util.ArrayList;

// concrete subject weather with temperature, humidity, air pressure
public class Wetterdaten 
{
	//list of observers (thermometer)
	List<Thermometer> thermos = new ArrayList<>();
	
	//variables for storing attributes
	private String temp = "14";
	private String humi = "60";
	private String press = "1,30";
	
	//add observer to observer list
	public void addThermo(Thermometer thermo) 
	{
		thermos.add(thermo);
		//sets itself as the observable
		thermo.observeWeather(this);
	}
	// delete observer from observer list
	public void deleteThermo(Thermometer thermo) 
	{
		thermos.remove(thermo);
	}
	//the notify method -> runs update on every observer
	public void notifyThermos()
	{
		for(Thermometer thermo : thermos)
		{
			thermo.update();
		}
	}
	// function to change variables from observable
	public void changeTemp(String temp)
	{
		this.temp = temp;
		notifyThermos();
	}
	public void changeHumi(String humi)
	{
		this.humi = humi;
		notifyThermos();
	}
	public void changePress(String press)
	{
		this.press = press;
		notifyThermos();
	}
	//functions to return values (they are private)
	public String getTemp()
	{
		return temp;
	}
	public String getHumi()
	{
		return humi;
	}
	public String getPress()
	{
		return press;
	}
	
}
