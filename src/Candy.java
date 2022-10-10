/**
 * A representation of a generic candy
 * @hidden test
 */
public class Candy implements IComestible {
    /**
     * The name of the candy
     */
    String Name;

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
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean wasConsumed() {
        return false;
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
}
