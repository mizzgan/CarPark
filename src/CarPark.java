import java.util.Collection;

/**
 * Created by Zamira on 4/1/16.
 */
public class CarPark implements CarParkI {

    private Collection<Talon> mTalons;

    public CarPark(Collection<Talon> talons) {
        this.mTalons = talons;
    }

    public int park(boolean truck){
        Size size;
        if (truck == true){
            size = Size.Huge;
        } else {
            size = Size.Small;
        }
        for(Talon item:mTalons){
            // Тут ищем место которое точно подходит для нашего авто
            if (item.getTalonSize() == size){
                item.setStatus(false);
                return item.getOrder();
            }
        }
        // Eсли не нашли, то хотя бы ищем место грузового для легковой машины
        for(Talon item:mTalons) {
            if (item.getTalonSize().ordinal() > size.ordinal()) {
                item.setStatus(false);
                return item.getOrder();
            }
        }
        return 0;
    }

    public int unpark(int number){
        for(Talon item:mTalons) {
            if (item.getOrder() == number) {
                item.setStatus(false);
                return number;
            }
        }
        return 0;
    }
}
