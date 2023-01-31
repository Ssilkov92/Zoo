package by.vtb;

// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public abstract class Creature {
    protected String type;
    protected String name;

    public Creature(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Type='" + this.type + "', name='" + this.name + "'";
    }

    abstract void breathe();

    abstract void move();

    public void printInfo() {
        this.move();
        this.breathe();
    }
}
