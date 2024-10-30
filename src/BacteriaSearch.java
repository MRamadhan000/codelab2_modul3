import BacteriaLibrary.BacteriaInfo;


/**
 * @author Titan
 *
 * @
 */
import java.util.ArrayList;
import java.util.Scanner;

public class BacteriaSearch {
    public static void main(String[] args) {
        ArrayList<Bacteria> bacteriaList = new ArrayList<>();
        addBacteria(bacteriaList);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Bacteria Search System!");
        System.out.println("1. Search by Type");
        System.out.println("2. Search by Colony Color");
        System.out.print("Choose an option: ");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 1:
                System.out.print("Enter the bacteria type to search for (e.g., Gram-positive): ");
                String type = scanner.nextLine();
                searchByType(bacteriaList, type);
                break;
            case 2:
                System.out.print("Enter the colony color to search for: ");
                String colonyColor = scanner.nextLine();
                searchByColonyColor(bacteriaList, colonyColor);
                break;
            default:
                System.out.println("Invalid option!");
        }
        scanner.close();
    }

    /**
     * Adds predefined Bacteria objects to the provided list.
     * Each Bacteria object is created with specific information about the bacteria type, colony color, and habitat.
     *
     * @param bacteriaList bacteriaList the list to which the new Bacteria objects will be added
     *
     */
    private static void addBacteria(ArrayList<Bacteria> bacteriaList) {
        bacteriaList.add(new Bacteria(new BacteriaInfo("Escherichia coli", "Gram-negative", "White", "Intestines")));
        bacteriaList.add(new Bacteria(new BacteriaInfo("Staphylococcus aureus", "Gram-positive", "Yellow", "Skin")));
        bacteriaList.add(new Bacteria(new BacteriaInfo("Pseudomonas aeruginosa", "Gram-negative", "Green", "Water")));
        bacteriaList.add(new Bacteria(new BacteriaInfo("Bacillus subtilis", "Gram-positive", "White", "Soil")));
    }

    /**
     * Searches for bacteria in the provided list by type and displays their information.
     * If no bacteria with the specified type is found, a message will be printed indicating so.
     *
     * @param bacteriaList the list of Bacteria objects to search within
     * @param type type the type of bacteria to search for (case insensitive)
     */
    public static void searchByType(ArrayList<Bacteria> bacteriaList, String type) {
        boolean found = false;
        for (Bacteria bacteria : bacteriaList)
            if (bacteria.getType().equalsIgnoreCase(type)) {
                bacteria.displayInfo();
                found = true;
            }

        if (!found)
            System.out.println("No bacteria found with type: " + type);

    }

    /**
     * Searches for bacteria in the provided list by colony color and displays their information.
     * If no bacteria with the specified colony color is found, a message will be printed indicating so.
     *
     * @param bacteriaList the list of Bacteria objects to search within
     * @param colonyColor the colony color of bacteria to search for (case insensitive)
     */
    public static void searchByColonyColor(ArrayList<Bacteria> bacteriaList, String colonyColor) {
        boolean found = false;
        for (Bacteria bacteria : bacteriaList)
            if (bacteria.getColonyColor().equalsIgnoreCase(colonyColor)) {
                bacteria.displayInfo();
                found = true;
            }
        if (!found)
            System.out.println("No bacteria found with colony color: " + colonyColor);
    }
}
