import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by s-gheldd on 11/9/15.
 */
public class CashRegisterMain {


    public static void main(String[] args) {


        Item pear = new Item("Pear", 1);
        Item ham = new Item("Ham", 2);
        Item beer = new Item("Beer", 3);
        Item computer = new Item("Computer", 1000);

        Customer grace = new Customer("Grace", 1945, Arrays.asList(pear, ham));
        Customer bob = new Customer("Bob", 1951, Arrays.asList(pear));
        Customer steve = new Customer("Steve", 1955, Arrays.asList(ham, beer, computer));
        Customer ada = new Customer("Ada", 1815, new ArrayList<>());

        List<Customer> customerList = new LinkedList<>();
        Collections.addAll(customerList, grace, steve, bob, ada);
        System.out.println(customerList);

        customerList = customerList.stream()
                .filter(c -> (!c.getItems().isEmpty()))
                .collect(Collectors.toList());
        System.out.println(customerList);

        System.out.println(customerList.stream()
                .map(c -> c.getName().toUpperCase())
                .collect(Collectors.toList()));


        System.out.println(customerList.stream()
                .sorted(Customer.orderByYearOfBirth)
                .collect(Collectors.toList()));


        //Fancy
        System.out.println(customerList.stream()
                .map(Customer::getItems)
                .collect(ArrayList<Item>::new, List::addAll, List::addAll).stream()
                .count());

    }
}
