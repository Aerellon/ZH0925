package hu.training360.javasetraining.pendrive;

import java.util.List;

public class Pendrive {

    private String name;
    private int capacity;
    private int price;

    public Pendrive(String name, int capacity, int price) {
        this.name = name;
        this.capacity = capacity;
        this.price = price;
    }

    // lehet private
    public void risePrice(int percent) {
        this.price += this.price * (1.0 * percent / 100);
    }

    // lehet private
    public int comparePricePerCapacity(Pendrive pendrive) {
        if (this.calcPricePerCapacity() < pendrive.calcPricePerCapacity()) {
            return 1;
        } else if (this.calcPricePerCapacity() > pendrive.calcPricePerCapacity()) {
            return -1;
        } else {
            return 0;
        }
    }

    // lehet private
    public boolean cheaperThan(Pendrive pendrive) {
        return this.price < pendrive.getPrice();
    }

    public static Pendrive best(List<Pendrive> pendrives) {
        Pendrive bestPendrive = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i++) {
            if (pendrives.get(i).comparePricePerCapacity(bestPendrive) == 1) {
                bestPendrive = pendrives.get(i);
            }
        }
        return bestPendrive;
    }

    public static Pendrive cheapest(List<Pendrive> pendrives) {
        Pendrive cheapestPendrive = pendrives.get(0);
        for (int i = 1; i < pendrives.size(); i++) {
            if (pendrives.get(i).cheaperThan(cheapestPendrive)) {
                cheapestPendrive = pendrives.get(i);
            }
        }
        return cheapestPendrive;
    }

    public static void risePriceWhereCapacity(List<Pendrive> pendrives, int percent, int capacity) {
        for (Pendrive pendrive : pendrives) {
            if (pendrive.getCapacity() == capacity) {
                pendrive.risePrice(percent);
            }
        }
    }

    public String getName() {
        return name;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Pendrive{" +
                "name = '" + name + '\'' +
                ", capacity = " + capacity + " Gb" +
                ", price = " + price + " Ft" +
                '}';
    }

    private double calcPricePerCapacity() {
        return 1.0 * this.price / this.capacity;
    }
}
