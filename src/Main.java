import duck.Duck;
import duck.RobertDuck;
import fly.FlyBehavior;
import fly.implement.FlyWithWings;

public class Main {
    public static void main(String[] args) {

        Duck robertDuck = new RobertDuck();
        robertDuck.flyPerform();

        FlyBehavior flyWithWings = new FlyWithWings();
        robertDuck.setFlyBehavior(flyWithWings);

        robertDuck.flyPerform();
        System.out.println("Strategy pattern!");
    }
}