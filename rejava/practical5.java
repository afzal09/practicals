class DisplayingOverloading {

    public void disp(char c) {
        System.out.print(c);
    }

    public void disp(char c, int num) {
        System.out.print(c + " " + num);
    }

    public void disp(int num) {
        System.out.print(num);
    }

    public static void main(String args[]) {
        DisplayingOverloading obj = new DisplayingOverloading();
        obj.disp('a');
        obj.disp('a', 10);
        obj.disp(3);
    }
}

// B
class Vehicle {
    void run() {
        System.out.println("Vehicle is running");
    }
}

class Bike extends Vehicle {
    void run() {
        System.out.println("Bike is running safely");
    }

    public static void main(String args[]) {
        Bike obj = new Bike();
        obj.run();
    }
}
