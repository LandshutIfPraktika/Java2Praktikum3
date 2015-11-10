/**
 * Klasse zur Artikelbehandlung: Praktikum zu Lambdas und Streams.
 * WS 2015/15 8.11.2015
 *
 * @author Gudrun Schiedermeier
 */


public class Item {
    /**
     * Artikelbezeichnung.
     */
    private final String name;
    /**
     * Preis.
     */
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Item [name=" + name + ", price=" + price + "]";
    }

}
