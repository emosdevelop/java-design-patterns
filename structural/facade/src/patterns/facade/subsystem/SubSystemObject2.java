package patterns.facade.subsystem;

public class SubSystemObject2 implements Abstraction {
    @Override
    public void on() {
        System.out.println(getClass().getSimpleName() + " is on!");
    }

    @Override
    public void off() {
        System.out.println(getClass().getSimpleName() + " is off!");
    }
}
