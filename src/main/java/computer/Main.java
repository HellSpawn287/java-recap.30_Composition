package computer;

import challenge.*;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20, 20, 5);
        Case theCase = new Case("220B", "Dell", "240", dimensions);
        Monitor monitor = new Monitor("27th inch BEAST", "Acer", 27, new Resolution(2540, 1440));
        Motherboard motherboard = new Motherboard("BJ-200", "Assus", 4, 6, "v2.44");

        PC pc = new PC(theCase, monitor, motherboard);
        pc.powerUp("Windows 10");

//        pc.getTheCase().pressPowerButton();
//        pc.getMonitor().drawPixelAt(1500, 1200, "red");
//        pc.getMotherboard().loadProgram("Windows 10");

        System.out.println("Now challenge time!! \n\n Compose bedroom\n");

        Wall wall_1 = new Wall("West");
        Wall wall_2 = new Wall("East");
        Wall wall_3 = new Wall("South");
        Wall wall_4 = new Wall("North");
        Ceiling ceiling = new Ceiling(12,55);
        Bed bed = new Bed("Wooden", 4, 3, 2,1);
        Lamp lamp = new Lamp("Clasic", false, 75);

        Bedroom bedroom = new Bedroom("Roberts", wall_1, wall_2, wall_3, wall_4, ceiling, bed, lamp);
        bedroom.makeBed();
        bed.make();
        bedroom.getLamp().turnOn();

    }
}
