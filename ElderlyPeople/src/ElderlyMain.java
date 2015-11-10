import java.util.ArrayList;
import java.util.List;

/**
 * Created by s-gheldd on 11/9/15.
 */
public class ElderlyMain {
    public static void main(String[] args) {
        final List<ElderlyPeople> elderly = new ArrayList<>();

        elderly.add(new ElderlyPeople("Hubert", 83, 1.25));
        elderly.add(new ElderlyPeople("Maria", 79, 1.11));
        elderly.add(new ElderlyPeople("Alois", 95, 1.65));
        elderly.add(new ElderlyPeople("Josefine", 76, 2.01));


        elderly
                .stream()
                .filter(old -> (old.getAge()>70&&old.getLongJumpDistance()>1.5))
                .forEach(System.out::println);

        System.out.println();

        elderly
                .stream()
                .filter(old -> (old.getAge() > 70))
                .max((old1, old2)->Double.compare(old1.getLongJumpDistance(),old2.getLongJumpDistance()))
                .ifPresent(System.out::println);
        System.out.println();
    }
}
