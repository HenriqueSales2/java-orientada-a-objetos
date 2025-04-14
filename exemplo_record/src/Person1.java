
public record Person1(String name, int age) {

    // no corpo do record não é possivel declarar variaveis, só static

    public Person1 {
     
    }

    public Person1(String name) {
        this(name, 1);
    }

    public String getInfo() {
        return "Name: " + name + " age: " + age;
    }
}
