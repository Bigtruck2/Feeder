public class Main
{
    public static void main(String[] args) {
        Feeder feeder = new Feeder(500);
        System.out.println(feeder.simulateManyDays(1,10));
        System.out.println(feeder.getCurrentFood());
    }
}