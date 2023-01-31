package by.vtb;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Bird extends Creature {
    public Bird(String type, String name) {
        super(type, name);
    }

    void breathe() {
        System.out.print(this.name + " breathes through its beak.\n");
    }

    void move() {
        System.out.print(this.name + " is flying.\n");
    }
}