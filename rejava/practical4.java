class Employee {
    float salary = 40000;
}

class Programmer extends Employee {
    int bonus = 10000;
}

public class Main {
    public static void main(String[] args) {
        Programmer p = new Programmer();
        System.out.println("Programmer salary: " + p.salary);
        System.out.println("Bonus of programmer: " + p.bonus);
    }
}
