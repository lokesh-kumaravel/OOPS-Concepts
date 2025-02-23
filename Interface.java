interface Vehicle {
    void start();

    void stop();
}

class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopping...");
    }
}

class Bike implements Vehicle {
    @Override
    public void start() {
        System.out.println("Bike is starting...");
    }

    @Override
    public void stop() {
        System.out.println("Bike is stopping...");
    }
}

public class Interface {
    public static void main(String[] args) {
        Vehicle myCar = new Car();
        myCar.start(); // Calls Car's start method
        myCar.stop(); // Calls Car's stop method

        Vehicle myBike = new Bike();
        myBike.start(); // Calls Bike's start method
        myBike.stop(); // Calls Bike's stop method
    }
}
