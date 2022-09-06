public class WormStone {
    private int wormAmount;
    private int stoneNumber;
    private String ownerOfStone;

    public WormStone(int wormAmount, int stoneNumber) {
        this.stoneNumber = stoneNumber;
        this.wormAmount = wormAmount;
    }

    public int getStoneNumber() {
        return this.stoneNumber;
    }

    public int getWormAmount() {
        return this.wormAmount;
    }

    public void setOwnerOfStone(String name) {
        this.ownerOfStone = name;
    }

    public String getOwnerOfStone() {
        return this.ownerOfStone;
    }
}
