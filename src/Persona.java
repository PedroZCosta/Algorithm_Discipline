public class Persona {
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

    public void useHabilities() {
        System.out.println("This character has no special abilities.");
    }

    public void showPersona(){
        System.out.printf("Name: " + getName());
        System.out.printf("\nAge: " + getAge());
        System.out.printf("\nHeight" + getHeight());

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
