import BacteriaLibrary.BacteriaInfo;

/**
 * Base structure for bacteria information.
 * <p>
 * This class represents a bacteria with specific attributes such as name, type,
 * colony color, and habitat. It is initialized using data from a {@link BacteriaInfo} object.
 * <p>
 * The class provides methods to retrieve information about the bacteria.
 */
public class Bacteria {
    private String name;
    private String type;
    private String colonyColor;
    private String habitat;

    /**
     *
     * @param bacteriaInfo a BacteriaInfo object containing information about the bacteria
     */
    public Bacteria(BacteriaInfo bacteriaInfo) {
        this.name = bacteriaInfo.name();
        this.type = bacteriaInfo.type();
        this.colonyColor = bacteriaInfo.colonyColor();
        this.habitat = bacteriaInfo.habitat();
    }

    /**
     * Displays information about the bacteria, including name, type, colony color, and habitat.
     */
    public void displayInfo() {
        System.out.println("Name: " + getName());
        System.out.println("Type: " + getType());
        System.out.println("Colony Color: " + getColonyColor());
        System.out.println("Habitat: " + getHabitat());
        System.out.println("---------------------");
    }

    /**
     *
     * @return the name of the bacteria
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return the type of the bacteria.
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @return the colonyColor of the bacteria.
     */
    public String getColonyColor() {
        return colonyColor;
    }

    /**
     *
     * @return the habitat of the bacteria.
     */
    public String getHabitat() {
        return habitat;
    }
}
