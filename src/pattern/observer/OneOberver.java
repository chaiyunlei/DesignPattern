package pattern.observer;

/**
 * Author: cYunl
 * Date: 2020/06/23
 * Time: 21:29
 */
public class OneOberver extends Observer {

    public OneOberver(Subject subject){
        this.subject = subject;
        subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println(subject.getState());
    }
}
