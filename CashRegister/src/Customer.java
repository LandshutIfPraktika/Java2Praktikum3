import java.util.Comparator;
import java.util.List;

/**
 * Klasse zur Artikelbehandlung Praktikum zu Lambdas und Streams.
 * WS 2015/16 8.11.2015
 *
 * @author Gudrun Schiedermeier
 */
public class Customer implements Comparable<Customer> {

    //Weitere Comparatoren zu erg�nzen
    public static final Comparator<Customer> orderByYearOfBirth = (c1, c2)->(c1.getYearOfBirth()-c2.getYearOfBirth());

    /**
     * Kundenname.
     */
    private final String name;
    /**
     * Geburtsjahr.
     */
    private final int yearOfBirth;
    /**
     * Liste der gekauften Artikel.
     */
    private List<Item> items;

    public Customer(String name, int year, List<Item> items) {
        this.name = name;
        this.yearOfBirth = year;
        this.items = items;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Customer [name=" + name + ", year=" + yearOfBirth + ", items=" + items + "]";
    }

    @Override
    public int compareTo(Customer other) {
        return this.name.compareTo(other.getName());
    }



}
