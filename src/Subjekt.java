
public interface Subjekt {
	public abstract void addObserver(Observer observer);
	public abstract void removeObserver(Observer observer);
	public abstract void notifyAllObservers();
}