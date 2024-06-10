package duck;

import fly.FlyBehavior;
import fly.implement.FlyNoWay;
import quack.QuackBehavior;
import quack.implement.Quack;

public class RobertDuck extends Duck {
    public RobertDuck() {
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new Quack());
    }

    @Override
    public void display() {
        System.out.println("Tao la vit robert");
    }
}
