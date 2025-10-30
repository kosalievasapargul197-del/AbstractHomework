public class Horse extends Animal {
    private String colour;

    public Horse(String colour) {
        this.colour = colour;
    }

    public Horse(int weight, int age, String gender, String name, String colour) {
        super(weight, age, gender, name);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return "Horse" + super.toString()+
                "\nЦвет: " + colour;
    }
}
