
import java.util.ArrayList;
import java.util.List;
 
public class Wetterdaten implements Subjekt {
 
	List<Observer> beobachterList = new ArrayList<Observer>();
 
	int temperatur = 0;
	int luftfeuchtigkeit = 0;
	int luftdruck = 0;
 
	@Override
	public void addObserver(Observer observer) {
		this.beobachterList.add(observer);
	}
 
	@Override
	public void removeObserver(Observer observer) {
		this.beobachterList.remove(observer);
	}
 
	@Override
	public void notifyAllObservers() {
		for (Observer observer : beobachterList) {
			observer.update();
		}
	}
 
	public int getTemp() {
		return temperatur;
	}
 
	public void setTemp(int temperatur) {
		this.temperatur = temperatur;
		this.notifyAllObservers();
	}
	
	public int getWet() {
		return luftfeuchtigkeit;
	}
	
	public void setWet(int luftfeuchtigkeit) {
		this.luftfeuchtigkeit = luftfeuchtigkeit;
		this.notifyAllObservers();
	}
	
	public int getPressure() {
		return luftdruck;
	}
	
	public void setPressure(int luftdruck) {
		this.luftdruck = luftdruck;
		this.notifyAllObservers();
	}
}
