package HW6;

public class HW6 {


        public static void main(String[] args) {
            Cat[] cat = new Cat[]{new Cat("Барсик", 200, 5), new Cat("Мурка", 210, 0), new Cat("Васька", 189, 12)};
            Dog dog1 = new Dog("Жучка", 250, 8);
            Dog dog2 = new Dog("Шарик", 300, 5);

            for (int i = 0; i < cat.length; ++i) {
                cat[i].run();
                cat[i].swim();
            }

            dog1.run();
            dog1.swim();
            dog2.run();
            dog2.swim();
            Cat.catCount();
            Dog.dogCount();
            Animal.animalCount();
        }
    }
