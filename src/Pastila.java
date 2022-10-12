import Generics.*;

/**
 * A traditional Russian fruit confectionery<p>
 * It's a small square of pressed fruit paste and light, airy puffs with a delicate apple flavor
 *
 * @author Adrian Sebastian Stan
 * @version 1.0.0
 */
public class Pastila extends Candy {
    /**
     * Create a new named pastila
     *
     * @param name The name of the pastila
     * @implNote The {@code name} should be the flavour of the pastila
     */
    public Pastila(String name) {
        super(name);
    }

    /**
     * Get the flavour of the pastila
     *
     * @return The flavour of the pastila
     */
    public String getFlavour() {
        return getName();
    }

    /**
     * Add the {@code decoration} to the pastila<p>
     * The {@code decoration} can be anything that is comestible, such as {@link Candy}
     *
     * @param decoration The decoration to add
     */
    public <T extends IComestible> void decorateWith(T decoration) {
        // add decorations to the pastila
    }
}
