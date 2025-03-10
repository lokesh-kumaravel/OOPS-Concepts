class Solution {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

class Bike {
    public void sound() {
        System.out.println("Traditional Bike sound!");
    }

    public void brake() {
        System.out.println("Traditional Bike sound!");
    }
}

class Rx extends Bike {
    @Override
    public void sound() {
        System.out.println("RX makes Good Sound!");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Solution overloading = new Solution();
        // Same method name in different forms is called as Polymorphism...
        System.out.println(overloading.add(1, 2));
        System.out.println(overloading.add(1, 2, 3));

        // compiler decides which method to execute in earlier in the overloading
        // concept but the overriding concept came to know which method to execute in
        // the run time

        // method overloading - compile time
        // method overriding - run time

        Bike bike1 = new Bike();
        bike1.sound();
        Bike bike2 = new Rx();
        bike2.sound();
    }
}
