package by.vtb;
import java.util.Scanner;
//hello
public class Animal extends Creature {
    public Animal(String type, String name) {
        super(type, name);
    }

    void breathe() {
        System.out.print(this.name + " breathes through the nose.\n");
    }

    void move() {
        System.out.print(this.name + " can run and jump.\n");
    }

    public void uniqueProperty() {
        System.out.println("\nWrite the unique property: ");
        Scanner scanner = new Scanner(System.in);
        String var10001 = this.name;
        System.out.println(var10001 + " " + scanner.nextLine());
    }
}
