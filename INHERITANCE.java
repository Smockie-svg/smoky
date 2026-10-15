public class INHERITANCE {

    static class Employee {
        float salary = 40000;
    }

    static class Programmer extends Employee {
        int bonus = 10000;
    }

    public static void main(String[] args) {

        Programmer P = new Programmer();

        System.out.println("Program salary is: " + P.salary);
        System.out.println("Program bonus is: " + P.bonus);
    }
}
