
public class Feeder {
    /**
     * The amount of food, in grams, currently in the bird feeder; initialized
     * in the constructor and always greater than or equal to zero
     */
    private int currentFood;

    public Feeder(int currentFood){
        this.currentFood = currentFood;
    }

    /**
     * This standard amount consumed is
     * between 10 and 50 grams of food, inclusive, in 1-gram increments.
     */
    public void simulateOneDay(int numBirds) {
        if(numBirds<=0) return;
        if((int) (Math.random()*100)<95){
            currentFood-=((int)(Math.random()*41) +10)*numBirds;
            if(currentFood<0){
                currentFood=0;
            }
        }else {
            currentFood=0;
        }
    }

    /**
     * Returns the number of days birds or a bear found food to eat at the
     * feeder in this simulation, as described in part (b) Preconditions:
     * numBirds > 0, numDays > 0
     */
    public int simulateManyDays(int numBirds, int numDays) {
        if(numBirds <= 0 && numDays <= 0) return 0;
        int counter = 0;
        for(int i=0;i<numDays;i++){
            simulateOneDay(numBirds);
            if(currentFood>0){
                counter++;
            }else{
                return counter;
            }
        }
        return counter;
    }
    public int getCurrentFood(){
        return currentFood;
    }
}
