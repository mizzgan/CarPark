package carpark;

import java.util.ArrayList;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Talon> talons = new ArrayList<Talon>();
        talons.add(new Talon(1, Size.Small, true));
        talons.add(new Talon(2, Size.Small, true));
        talons.add(new Talon(3, Size.Small, true));
        talons.add(new Talon(4, Size.Small, true));
        talons.add(new Talon(5, Size.Huge, false));

        CarPark carPark = new CarPark(talons);
        Integer parkResult = carPark.park(true);

        if (parkResult != 0){
            System.out.println("number: " + parkResult.toString());
        } else {
            System.out.println("No one free parking place");
        }
    }
}
