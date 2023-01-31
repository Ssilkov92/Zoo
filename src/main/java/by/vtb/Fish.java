package by.vtb;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Fish extends Creature {
    public Fish(String type, String name) {
        super(type, name);
    }

    void breathe() {
        System.out.print("Fish breathe with their gills.\n");
    }

    void move() {
        System.out.print("Fish swim under water.\n");
    }
}