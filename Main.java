package methodOverload;
/*
 * 3. Create a Main class with a main method to test the Person class by creating objects using each constructor and printing their details.
 */
public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Rajii");
        Person person2 = new Person("Banu", 24);
        Person person3 = new Person("Gokila", 24, "Friends");

        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person3);
    }
}
