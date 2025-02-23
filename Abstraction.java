abstract class Bike {
    public abstract void sound();

    public abstract void stroke();

    public void brake() {
        System.out.println("Applied brake!");
    }
}

class Unicorn extends Bike {
    @Override
    public void brake() {
        System.out.println("Unicorn special brake Applied!");
    }

    public void sound() {
        System.out.println("Unicorn has different sound!");
    }

    public void stroke() {
        System.out.println("Unicorn is 4 stroke");
    }
}

class Rx extends Bike {
    public void sound() {
        System.out.println("Rx has different sound");
    }

    public void stroke() {
        System.out.println("Rx   is 4 stroke");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bike bike = new Rx();
        bike.brake();
        Unicorn unicorn = new Unicorn();
        unicorn.brake();
    }
}
