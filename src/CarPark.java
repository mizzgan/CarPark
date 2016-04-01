import java.util.Collection;

/**
 * Created by Zamira on 4/1/16.
 */
public class CarPark {

    private Collection<Talon> mTalons;

    public CarPark(Collection<Talon> talons) {
        this.mTalons = talons;
    }

    /**
     * Метод возвращает null если подходящих мест не найдено.
     * @param car
     * @return
     */
    public Talon pushCar(Car car){
        for(Talon item:mTalons){
            // Тут ищем место которое точно подходит для нашего авто
            if (item.getTalonSize() == car.getSize()){
                mTalons.remove(item);
                return item;
            }
        }
        // Eсли не нашли, то хотя бы ищем место грузового для легковой машины
        for(Talon item:mTalons) {
            if (item.getTalonSize().ordinal() > car.getSize().ordinal()) {
                mTalons.remove(item);
                return item;
            }
        }
        return null;
    }

    public void popCar(Talon talon){
        mTalons.add(talon);
    }
}
