public class Cow extends Animal {

    public Cow(int weight, int age, String gender, String name) {
        super(weight, age, gender, name);
    }

    @Override
    public String toString() {
        return "Cow" + super.toString();
    }
}
