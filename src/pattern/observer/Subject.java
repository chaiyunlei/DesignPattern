package pattern.observer;

import java.util.List;

/**
 * Author: cYunl
 * Date: 2020/06/23
 * Time: 21:23
 */
public class Subject {
    private int state;
    private List<Observer> observers;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer){
        observers.add(observer);
    }
    
    public void notifyAllObservers(){
        for (Observer o : observers) {
            o.update();
        }
    }
}
