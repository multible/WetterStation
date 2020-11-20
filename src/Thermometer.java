

// this class represents the "Aktuelle Bedingungen" class from the task
public class Thermometer {
	
	//name to identify
	private String name;
	private Wetterdaten wetter = new Wetterdaten();
	
	
	public Thermometer(String name) {
		super();
		this.name = name;
	}
	//update function -> gets triggered by wetterdaten, if they change
	public void update() {
		System.out.println(name + ": Weather changed \n Temperature: " + wetter.getTemp() + "C\n Humidity: " + wetter.getHumi() + "%\n Air Pressure: " + wetter.getPress()+"bar");
	}
	//who am I observing? -> to get data
	public void observeWeather(Wetterdaten weather)
	{
		wetter = weather;
	}
	
}
