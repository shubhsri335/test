public class Human {
    public String name;
    public int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Human{name='" + name + "', age=" + age + '}';
    }
}
