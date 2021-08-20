package v2;

public class HW2 {


    public static void main(String[] args) {
        System.out.println(p1(13, 7));
        p2(1);
        System.out.println(p3(-5));
        p4("Len4ik", 3);

    }

    public static boolean p1(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <=20) {
            return true;
        }
        return false;
    }

    public static void p2(int x) {
        if (x >= 0) {
            System.out.println("Положительное");
        }
        else {
            System.out.println("Отприцательное");
        }
    }

    public static boolean p3(int x) {
        if (0 >= x) {
            return true;
        }
        else {
            return false;
        }
    }

    public static void p4(String str, int n) {
        for (int i = 1; i <= n; i++) {
            System.out.println("[" + i + "]" + " " + str);
        }
    }
        }
