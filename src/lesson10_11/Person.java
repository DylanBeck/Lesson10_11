package lesson10_11;

public class Person {

    String name;
    int age;

    public Person(String n, int a) {
        name = n;
        age = a;
    }

    public String toString() {
        return "Name: " + name + "\tAge: " + age;
    }
}
