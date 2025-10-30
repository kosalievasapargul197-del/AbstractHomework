public class Sheep extends Animal{

    public Sheep() {
    }

    public Sheep(int weight, int age, String gender, String name) {
        super(weight, age, gender, name);
    }

    @Override
    public String toString() {
        return "Sheep" + super.toString();
    }
}
