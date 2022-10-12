package Generics;


/**
 * A generic candy
 *
 * @author Adrian Sebastian Stan
 * @version 1.0.1
 */
public class Candy implements IComestible {
    /**
     * Tracks the consumed state of the candy
     */
    private boolean isConsumed = false;

    /**
     * The name of the candy
     */
    private String Name;

    /**
     * Create a new named candy
     *
     * @param name The name of the candy
     */
    public Candy(String name) {
        setName(name);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void consume() {
        System.out.printf("%s consumed%n", Name);
        isConsumed = true;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean wasConsumed() {
        return isConsumed;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void setName(String name) {
        Name = name;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String getName() {
        return Name;
    }

    /**
     * Switch the owner of the candy to the {@code anotherConsumer}
     *
     * @param anotherConsumer The receiver of the candy
     * @throws Exception When {@code anotherConsumer} is null or the candy is already consumed
     * @deprecated Due to an obsession with the exceptions
     */
    public void giveCandyTo(Object anotherConsumer) throws Exception {
        if (anotherConsumer == null) {
            throw new Exception("The other consumer was not found");
        } else if (wasConsumed()) {
            throw new Exception(String.format("The %s %s is already consumed!", getName(), this.getClass().getName()));
        }

        // switch
    }

    /**
     * Switch the owner of the candy to the {@code anotherConsumer}
     *
     * @param anotherConsumer The receiver of the candy
     * @return True if the switch was successful; otherwise False
     */
    public boolean tryGivingCandyTo(Object anotherConsumer) {
        if (anotherConsumer == null) {
            // handle null consumer
            return false;
        } else if (wasConsumed()) {
            // handle already consumed candy
            return false;
        }

        // switch
        return true;
    }
}
