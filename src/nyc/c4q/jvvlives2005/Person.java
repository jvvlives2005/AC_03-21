package nyc.c4q.jvvlives2005;

/**
 * Created by c4q-joshelynvivas on 3/21/15.
 */


public class Person {

    public String name;
    public int age;

    public static int counter = 0;

    public Person(String name, int age) {          /** Two constructors: public Person (note: Person
     * is a constructor.*/
        this.name = name;
        this.age = age;
        counter++;
    }

    public Person() {
        this.name = "newborn - no name";
        counter++;
    }

    public Person(String myName) {
        name = myName;
        counter++;
    }

    public void setName(String newName) {
        this.name = newName;    //similar to name = name
        counter++;
    }

    public String getName() {

        return this.name;
    }

    public void setAge(int newAge) {

        this.age = newAge;
    }

    public int getAge() {
        return this.age;
    }

    public static void speak() {

        System.out.println("hi");
    }

    public static void showCounter() {

















        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());

        p2.setName("bill");

        System.out.println(p1.getName());
        System.out.println(p2.getName());
        System.out.println(p3.getName());
    }
}