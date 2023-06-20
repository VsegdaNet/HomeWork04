package HomeWork04.armors;

public class Plate implements Armor {
    @Override
    public int getDefence() {
        return 5;
    }
    @Override
    public String toString() {
        return String.format("Plate: %d", getDefence());
    }
}