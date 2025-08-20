public class Persona extends SuperHero {
    private String name;
    private Integer age;
    private Float height;

    public Persona() {
    }

    public Persona(String name, Integer age, Float altura) {
        this.name = name;
        this.age = age;
        this.height = altura;
    }

    public void showPersona(){
        System.out.printf("Name: " + getName());
        System.out.printf("Age: " + getAge());
        System.out.printf("Height" + getHeight());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Float getHeight() {
        return height;
    }

    public void setHeight(Float height) {
        this.height = height;
    }
}
