//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Sheep sheep1 = new Sheep(50,5,"Баран","Пушистик");
        Sheep sheep2 = new Sheep(55,6,"Овца","Облачко 1");
        Sheep sheep3 = new Sheep(60,9,"Овца","Облачко 2");

        Cow cow1 = new Cow(400,3,"Бык","Бычок");
        Cow cow2 = new Cow(350,5,"Корова","Полосатая");
        Cow cow3 = new Cow(300,3,"Бык","Бычачо");
        Cow cow4 = new Cow(350,4,"Корова","Борка");
        Cow cow5 = new Cow(500,4,"Бык","Бычлише");

        Horse horse1 = new Horse(450,7,"Жеребец","Спирит","Оранжевй");
        Horse horse2 = new Horse(400,7,"Кобыла","Гроза","Белая");

        Farm farm1 = new Farm("Байтик Баатыра 66/2",new Cow[]{cow1,cow2,cow3,cow4,cow5}, new Horse[] {horse1,horse2},new Sheep[]{sheep1,sheep2,sheep3},"Джонатан");
        Farm farm2 = new Farm("Аалы Токонбаева 50/2",new Cow[]{cow1,}, new Horse[] {horse1,},new Sheep[]{sheep1,},"Джони");


        System.out.println(farm1);
        System.out.println(farm2);






    }
}