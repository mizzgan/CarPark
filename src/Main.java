import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Talon> talons = new ArrayList<Talon>();
        talons.add(new Talon(1, Size.Small));
        talons.add(new Talon(2, Size.Small));
        talons.add(new Talon(3, Size.Small));
        talons.add(new Talon(4, Size.Small));
        talons.add(new Talon(5, Size.Small));
	    CarPark carPark = new CarPark(talons);
        Car car = new TruckCar();

        Talon talon = carPark.pushCar(car);
        if (talon != null){
            System.out.println("number: " + talon.getOrder() + "\nsize: " + talon.getTalonSize());
        } else {
            System.out.println("No one free parking place");
        }
    }
}
