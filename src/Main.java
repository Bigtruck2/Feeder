import java.util.Arrays;

public class Main
{
    public static void main(String[] args) {
        Feeder feeder = new Feeder(500);
        System.out.println(feeder.simulateManyDays(1,10));
        System.out.println(feeder.getCurrentFood());
        testSingleDay(1000,22);
        testSingleDay(500,12);
        testSingleDay(100,5);
        testMultiDay(2400,10,4);
        testMultiDay(250,10,5);
        testMultiDay(0,5,10);
    }
    public static void testSingleDay(int food,int birds){
        int[] endOfDayFood = new int[100];
        for(int i =0; i<100;i++) {
            Feeder feeder = new Feeder(food);
            feeder.simulateOneDay(birds);
            endOfDayFood[i] = feeder.getCurrentFood();
        }
        System.out.println("Food:"+food+" Birds:"+birds+"\nResults:"+ Arrays.toString(endOfDayFood));
    }
    public static void testMultiDay(int food,int birds,int days){
        int[] endOfDayFood = new int[100];
        int[] daysFeederFound = new int[100];
        for(int i =0; i<100;i++) {
            Feeder feeder = new Feeder(food);
            daysFeederFound[i] = feeder.simulateManyDays(birds, days);
            endOfDayFood[i] = feeder.getCurrentFood();
        }
        System.out.println("Food:"+food+" Birds:"+birds+" Days:"+days+"\nResults:"+ Arrays.toString(endOfDayFood)+"\nDays found:"+ Arrays.toString(daysFeederFound));
    }
}