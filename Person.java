package methodOverload;
/**
 * 2. Create a class named Person. Overload the constructors such that first constructor takes a single String argument for the name, second takes a String argument for the name and an int argument for the age and third constructor takes a String argument for the name, an int argument for the age, and a String argument for the address.
 */
public class Person {
    private String name;
    private int age;
    private String address;

    public Person(String name) {
        this.name = name;
        this.age = 0;        
        this.address = "Unknown"; 
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown"; 
        }

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

//    @Override
//    public String toString() {
//        return "Person [name=" + name + ", age=" + age + ", address=" + address + "]";
//    }

    public static void main(String[] args) {
        Person p1 = new Person("Rajeshwari");
        Person p2 = new Person("Banu", 24);
        Person p3 = new Person("Gokila", 25, "Chennai");

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
