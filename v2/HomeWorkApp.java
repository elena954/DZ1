package v2;

public class HomeWorkApp {
    public static void main(String[] args) {
    // пункт 6
    printThreeWords();
    checkSumSign();
    printColor();
    compareNumbers();
}

    //пункт 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    // пункт 3
    public static void checkSumSign() {
        int a = 13;
        int b = 13;
        int sum = a + b;

        if (sum >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    // пункт 4
    public static void printColor() {
        int value = 110;

        if (value <= 0) {
            System.out.println("Красный");
        } else if (value > 0 & value <= 100) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }

    // пункт 5
    public static void compareNumbers() {
        int a = 26;
        int b = 40;

        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
