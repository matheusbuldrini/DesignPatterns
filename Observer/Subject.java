package Observer;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Subject {
	private List<Observer> observers = new LinkedList<Observer>();

	public void addObserver(Observer observer) {
		observers.add(observer);
	}

	public void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	public void notifyObservers() {
		Iterator<Observer> it = observers.iterator();
		while (it.hasNext()) {
			Observer obs = it.next();
			obs.update(this);
		}
	}
}