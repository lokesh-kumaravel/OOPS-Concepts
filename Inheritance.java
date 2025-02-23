class Bike {
    String name = "Normal Bike";

    public void sound() {
        System.out.println("Normal Sound");
    }
}

class Pulsar extends Bike {
    @Override
    public void sound() {
        System.out.println("Name : " + name); // Overridden sound method in Pulsar
    }

    public void smooth() {
        System.out.println("Pulsar smooth");
    }
}

class Rx extends Pulsar {
    @Override
    public void smooth() {
        System.out.println("RX smooth"); // Overridden smooth method in Rx
    }
}

public class Inheritance {
    public static void main(String[] args) {
        // Creating instance of Pulsar class
        Pulsar pulsar = new Pulsar();
        pulsar.sound(); // Calls the overridden sound method in Pulsar

        // Creating instance of Rx class
        Rx myRx = new Rx(); // Renamed the variable to follow naming conventions
        myRx.smooth(); // Calls the overridden smooth method in Rx
    }
}
