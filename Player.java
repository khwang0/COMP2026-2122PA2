import java.util.concurrent.ThreadLocalRandom;

/**
 * Model the player
 */
public class Player {
    /**
     * The length of the list
     */
    private static final int LIST_LENGTH = 6;
    /**
     * A secret list of a player. This list would not be changed during the game
     */
    private Character[] myList;
    /**
     * The number of veto (reject) voting card. Decrement it when the player vote
     * reject.
     */
    private int vetoCard;
    /**
     * The name of the player.
     */
    private String name;

    /**
     * Compute the score of a player. Each player should have a list of character
     *
     * @return the score of a player.
     */
    public int getScore() {
       //TODO
    }

    /**
     * Return the name of a player.
     * @return the name of the player
     */
    public String getName() { 
        //TODO
     }

    /**
     * Initialize the number of veto card
     * @param card the number of veto card
     */
    public void initVetoCard(int card) {
        //TODO
    }

    /**
     * Initialize all data attributes.
     * @param name the name of the player
     * @param list a whole list of characters and the player should pick
     *             LIST_LENGTH of <b>unique</b> characters
     */
    public Player(String name, Character[] list) {
        //TODO
    }

    /**
     * A method to vote according to the preference of the parameter support.
     * A player is forced to vote yes (support) if he/she has no more veto card.
     *
     * @param support The preference of the player
     * @return true if the player support it. False if the player reject (veto).
     */
    public boolean vote(boolean support) {
        //TODO
    }

    /**
     * Vote randomly. The player will be forced to vote support(true) if he is
     * running out of veto card.
     * @return true if the player support it. False if the player reject (veto).
     */
    public boolean voteRandomly() {
        //TODO
    }

    /**
     * Randomly place a character during the placing stage. This method should pick a
     * random unplaced character and place it to a random valid position.
     * @param list The list of all characters. Some of these characters may have been
     *             placed already
     * @return the character that just be placed.
     */
    public Character placeRandomly(Character[] list) {
        //TODO
    }

    /**
     * The player shall vote smartly (i.e., its decision will be based on if the player has that
     * character in his/her list.) If the player is running out of veto card, he/she will be forced
     * to vote support (true).
     *
     * @param character The character that is being vote.
     * @return true if the player support, false if the player reject(veto).
     */
    public boolean voteSmartly(Character character) {
        //TODO
    }

    /**
     * The player shall pick a randomly character that is <i>movable</i> during the playing stage.
     * Movable means the character has not yet be killed and the position right above it is not full.
     *
     * Note: this method should not change the position of the character.
     *
     * @param list The entire list of characters
     * @return the character being picked to move. It never returns null.
     */
    public Character pickCharToMoveRandomly(Character[] list) {
        // TODO
    }

    /**
     * This method return the character who's name is the same as the
     * variable name if the character is <i>movable</i>. Movable means
     * the character has not yet be killed and the position right above
     * it is not full.
     *
     * If the name of the character can't be found from the list or the
     * character is not movable, this method returns null.
     *
     * Note: this method should not change the position of the character.
     *
     * @param list The entire list of characters
     * @param name The name of the character being picked.
     * @return the character being picked to move or null if the character
     *          can't be found or the it is not movable.
     */
    public Character pickCharToMove(Character[] list, String name) {
        //TODO
    }

    /**
     * Similar to pickCharToMoveRandomly only as the character being picked to move
     * is related to the secret list of the player. The implementation of this part is
     * open and you are advised to optimize it to increase the chance of winning.
     *
     * Note: this method should not change the position of the character.
     *
     * @param list The list of character
     * @return the character to be move. It never returns null.
     */
    public Character pickCharToMoveSmartly(Character[] list) {
        //TODO
    }

    /**
     * This returns the name of the player and the secret list of the characters.
     * as a string
     * @return The name of the player followed by the secret list of the characters.
     */
    public String toString() {
        //TODO
    }
}
