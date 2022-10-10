/**
 * Represent a comestible
 */
public interface IComestible {
    /**
     * Consume the comestible
     */
    void consume();

    /**
     * Determine if the comestible was consumed
     *
     * @return True if the comestible is consumed; otherwise False
     */
    boolean wasConsumed();

    /**
     * Set the name of the comestible
     *
     * @param name The new name of the comestible
     */
    void setName(String name);

    /**
     * Get the name of the comestible
     *
     * @return The name of the comestible
     */
    String getName();
}
