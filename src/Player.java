import java.util.ArrayList;

public class Player {
    
    private String name;
    private int playerNumber;
    private int Score;
    private ArrayList ownedStone;

    /**
     * Constructor for the Player class
     * @param name
     * @param playerNumber
     */
    public Player(String name, int playerNumber) {
        this.name = name;
        this.playerNumber = playerNumber;
        ArrayList<Integer> this.ownedStone = new ArrayList<>();
    } // end of constructor

    /**
     * Add stones to player and adding it to stones.
     * @param stoneNumber
     * @param wormAmount
     */
    public void addStone(int stoneNumber, int wormAmount) {
        this.Score += wormAmount;
        this.ownedStone.add(stoneNumber);
    } // end of method addStone()

    /**
     * Removes stones from a player
     * @param stoneNumber
     * @param wormAmount
     */
    public void removeStone(int stoneNumber, int wormAmount) {
        this.ownedStone.remove(stoneNumber);
        this.Score -= wormAmount;
    } // end of method removeStone()

    /**
     * returns the current set score of the player
     * @return int: Score
     */
    public int getScore() {
        return this.Score;
    } // end of getScore() method

}
