package HW5;

public class Hw5 {public static void main(String[] args) {
    Workers[] employeeArray = new Workers[5];
    employeeArray[0] = new Workers("Ivanov Ivan", "Java Developer", "Ivan@gmail.com", "89279111", 37000, 41);
    employeeArray[1] = new Workers("Pupkin Vasiliy", "Teamlead", "VasiliyPup@gmail.com", "89279222", 39000, 42);
    employeeArray[2] = new Workers("Moroz Oleg", "QA-Engineer", "Moroz@gmail.com", "89279333", 38000, 38);
    employeeArray[3] = new Workers("Danilova Ol'ga", "Java Developer", "Ol'gaLova@gmail.com", "89279344", 38000, 30);
    employeeArray[4] = new Workers("Kushnir Poman", "QA-Engineer", "Kush@gmail.com", "89279555", 38000, 28);

    for (int i = 0; i < employeeArray.length; i++) {
        if (employeeArray[i].getAge() > 40) {
            employeeArray[i].print();
        }
    }
}
}
