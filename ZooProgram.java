package by.vtb;
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//
//STAS
import java.util.LinkedList;
        import java.util.Scanner;

public class ZooProgram {
    private static final String ANIMAL_TYPE = "Animal";
    private static final String FISH_TYPE = "Fish";
    private static final String BIRD_TYPE = "Bird";

    public ZooProgram() {
    }

    public static void printCreature(LinkedList list) {
        int number;
        do {
            System.out.println("\nWrite the number of the creature to print it's info.\nWrite '0' - to exit.");
            Scanner scanner = new Scanner(System.in);
            number = scanner.nextInt();

            try {
                System.out.println(list.get(number - 1));
            } catch (IndexOutOfBoundsException var4) {
                if (number != 0) {
                    System.out.println("There is no such number in the zoo! Try again.");
                } else {
                    System.out.println();
                }
            }
        } while(number != 0);

    }

    public static void main(String[] args) {
        Animal lion = new Animal("Animal", "Lion");
        lion.breathe();
        lion.move();
        lion.uniqueProperty();
        System.out.println();
        LinkedList<Creature> zooList = new LinkedList();
        zooList.add(lion);
        zooList.add(new Animal("Animal", "Leopard"));
        zooList.add(new Animal("Animal", "Monkey"));
        zooList.add(new Fish("Fish", "salmon"));
        zooList.add(new Fish("Fish", "shark"));
        zooList.add(new Bird("Bird", "parrot"));
        zooList.add(new Bird("Bird", "owl"));
        printCreature(zooList);
    }
}
