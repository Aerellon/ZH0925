package hu.training360.javasetraining.pendrive;

import java.util.ArrayList;
import java.util.List;

public class Pendrives {
    public static void main(String[] args) {
        List<Pendrive> pendriveList = new ArrayList<>();

        Pendrive p1 = new Pendrive("Pendrive v0.1", 16, 5000);      // ppc: 312.5
        Pendrive p2 = new Pendrive("Pendrive v0.2", 32, 6000);      // ppc: 187.5
        Pendrive p3 = new Pendrive("Pendrive v0.3", 64, 8000);      // ppc: 125.0
        Pendrive p4 = new Pendrive("Pendrive v0.4", 128, 12000);    // ppc: 93.75
        Pendrive p5 = new Pendrive("Pendrive v0.5", 256, 14000);    // ppc: 54.6875

        pendriveList.add(p1);
        pendriveList.add(p2);
        pendriveList.add(p3);
        pendriveList.add(p4);
        pendriveList.add(p5);


        System.out.println("Cheapest: " + Pendrive.cheapest(pendriveList).toString());

        System.out.println("Best: " + Pendrive.best(pendriveList).toString());
        Pendrive.risePriceWhereCapacity(pendriveList, 100, 256);
        System.out.println("Best: " + Pendrive.best(pendriveList).toString());
    }
}
