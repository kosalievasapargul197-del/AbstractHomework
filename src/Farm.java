import java.util.Arrays;

public class Farm {
    private String address;
    private Cow[] cows;
    private Horse[] horses;
    private Sheep[] sheep;
    private String ownerName;

    public Farm(String address, Cow[] cows, Horse[] horses, Sheep[] sheep, String ownerName) {
        this.address = address;
        this.cows = cows;
        this.horses = horses;
        this.sheep = sheep;
        this.ownerName = ownerName;
    }

    @Override
    public String toString() {
        return "\n==== Farm info ====" +
                "\nАдрес: " + address +
                "\nВладелец: " + ownerName +
                "\nОвцы: " + Arrays.toString(sheep) +
                "\nКоровы: " + Arrays.toString(cows) +
                "\nЛошади: " + Arrays.toString(horses);
    }
}

