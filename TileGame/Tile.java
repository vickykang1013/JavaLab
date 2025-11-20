package TileGame;

/**
 * Tile class shows a single Scrabble tile.
 * Each tile has a letter and a point value.
 * @author Vicky Kang
 * @since 11/15/2025
 */


public class Tile {
    private char letter;
    private int value;


    /**
     * Constructor: initializes the tile with a letter and value
     * @param letter the character of the tile
     * @param value the point value of the tile
     */
    public Tile(char letter, int value) {
        this.letter = letter;
        this.value = value;
    }


    /**
     * Copy constructor
     * @param obj the Tile object to copy
     */
    public Tile(Tile obj) {
        this.letter = obj.letter;
        this.value = obj.value;
    }


    /**
     * Sets the letter of the tile
     * @param letter the character to set
     */
    public void setLetter(char letter) {
        this.letter = letter;
    }


    /**
     * Sets the value of the tile
     * @param value the point value to set
     */
    public void setValue(int value) {
        this.value = value;
    }


     /**
     * @return the object's letter
     */
    public char getLetter() {
        return this.letter;
    }


    /**
     * Gets the value of the tile
     * @return the tile's point value
     */
    public int getValue() {
        return this.value;
    }


    /**
     * Compares two tiles by letter
     * @param other the Tile object to compare
     * @return true if letters are the same, false otherwise
     */
    public boolean equals(Tile other) {
        return this.letter == other.letter;
    } 


    /**
     * Returns a string representation of the tile
     * @return a string
     */
    public String toString() {
        return String.format("%c (value = %d)", letter, value);
    }
    
}
