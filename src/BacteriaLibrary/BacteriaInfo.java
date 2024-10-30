package BacteriaLibrary;

/**
 * Represents information about a bacterium, including its name, type, colony color, and habitat.
 * This record provides a simple way to encapsulate the attributes of a bacterium.
 * @param name the name of the bacterium
 * @param type the type of the bacterium (e.g., Gram-negative, Gram-positive)
 * @param colonyColor he color of the bacterium's colony
 * @param habitat the natural habitat where the bacterium is commonly found
 */
public record BacteriaInfo(String name, String type, String colonyColor, String habitat) {
}