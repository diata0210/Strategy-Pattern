package quack.implement;

import quack.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Toi deo biet gay");
    }
}
