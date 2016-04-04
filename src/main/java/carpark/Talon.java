package main.java.carpark;

import main.java.carpark.Size;

/**
 * Created by Zamira on 4/1/16.
 */
public class Talon {
    private final int order;
    private boolean status; // true - free parking place. false - taken
    private final Size size;

    public Talon(int order, Size size, boolean status) {
        this.status = status;
        this.order = order;
        this.size = size;
    }

    public int getOrder() {
        return order;
    }

    public Size getTalonSize() {
        return size;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
