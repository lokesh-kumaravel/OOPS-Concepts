interface A {
    default void show() {
        System.out.println("A's show method");
    }
}

interface B extends A {
    default void show() {
        System.out.println("B's show method");
    }
}

interface C extends A {
    default void show() {
        System.out.println("C's show method");
    }
}

// 🔴 Diamond Problem Occurs Here
class D implements B, C {
    // Must override show() to resolve ambiguity
    // @Override
    public void show() {
        B.super.show();
        // System.out.println("D's own show method"); // Resolving the conflict
    }
}

public class Diamond {
    public static void main(String[] args) {
        D obj = new D();
        obj.show(); // Output: D's own show method
    }
}

// interface A {
// static void sound() {
// System.out.println("Hello from A!");
// }
// }

// interface B extends A {
// static void sound() {
// System.out.println("Hello from B!");
// }
// }

// interface C extends A {
// static void sound() {
// System.out.println("Hello from C!");
// }
// }

// class D implements B, C {
// void sound() {
// System.out.println("Hello from D!");
// }
// }

// public class Diamond {
// public static void main(String[] args) {
// D obj = new D();
// obj.sound();
// }
// }
