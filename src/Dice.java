import java.util.Random;

public class Dice {

    private int numberOfSides;
    private int faceValues;

    /**
     * Constructor for the Dice object. Number of sides can be specified via the sideAmount param.
     * @param sideAmount
     */
    public Dice(int sideAmount){
        numberOfSides = sideAmount;

        Random randomNumGenerator = new Random();
        faceValues = randomNumGenerator.nextInt(numberOfSides) + 1;
    } //end of constructor method


    /**
     * This function will simulate rolling the dice
     */
    public void rollingDice(){
        Random randomNumGenerator = new Random();
        faceValues = randomNumGenerator.nextInt(numberOfSides) + 1;
    } // end of method rollingDice()

    /**
     * This method returns the facevalue of the Dice object
     */
    public int getFaceValue(){
        return faceValues;
    } //end of method getFaceValue()
}
