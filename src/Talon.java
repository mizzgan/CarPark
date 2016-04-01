/**
 * Created by Zamira on 4/1/16.
 */
public class Talon {
    private final int order;
    private final Size size;

    public Talon(int order, Size size) {
        this.order = order;
        this.size = size;
    }

    public int getOrder() {
        return order;
    }

    public Size getTalonSize() {
        return size;
    }
}
