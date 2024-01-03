

public class Person {
    public String fullName;
    public int age;

    public Person() {
    }


    public Person(String fullName, int age) {
        this.fullName = fullName;
        this.age = age;
    }

    public void move() {
        System.out.println(fullName + " is moving.");
    }

    public void talk() {
        System.out.println(fullName + " is talking.");
    }

    public static void main(String[] args) {
        Person person1 = new Person();
        person1.fullName = "ronaldo";
        person1.age = 17;

        Person person2 = new Person("messi", 18);

        person1.move();
        person1.talk();

        person2.move();
        person2.talk();
    }
}