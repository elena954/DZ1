package HW6;

public class Cat  extends Animal {
    static int catCount;
    final int runMaxL = 200;

    public Cat(String name, int runLenght, int swimLenght) {
        super(name, runLenght, swimLenght);
        ++catCount;
    }

    public void run() {
        if (this.runLenght <= 200) {
            super.run();
        } else {
            System.out.println("Кот " + this.name + " не может бегать на такое расстояние.");
        }

    }

    public void swim() {
        System.out.println("Коты не умеют плавать...");
    }

    public static void catCount() {
        System.out.println("количество котов " + catCount);
    }
}
