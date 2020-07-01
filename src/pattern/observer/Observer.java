package pattern.observer;

/**
 * Author: cYunl
 * Date: 2020/06/23
 * Time: 21:21
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
