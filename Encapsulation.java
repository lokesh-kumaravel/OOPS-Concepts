
class Solution {
    private String name;
    private int age;

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            System.out.println("Name cannot be empty!");
        } else {
            this.name = name;
        }
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Age is invalid!");
        } else {
            this.age = age;
        }
    }

    public void display() {
        System.out.println("Name : " + name + " Age : " + age);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.setName("Lokesh K");
        sol.setAge(20);
        sol.display();
        // System.out.println(sol.name); this line shows error bcoz the variable is
        // private...
        // System.out.println(sol.age); this line shows error bcoz the variable is
        // private...
    }
}
