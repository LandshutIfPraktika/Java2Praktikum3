/**
 * Klasse zum Praktikum Lambdas und Streams
 * WS 2015/16, 8.11.2015
 *
 * @author Gudrun Schiedermeier
 */
public class ElderlyPeople {
    /**
     * Name der Person.
     */
    private final String name;
    /**
     * Alter der Person.
     */
    private int age;
    /**
     * Bestes Weitsprungergebnis des letzten Wettkampf.
     */
    private double longJumpDistance;

    public ElderlyPeople(String name, int age, double longJumpDistance) {
        this.name = name;
        this.age = age;
        this.longJumpDistance = longJumpDistance;
    }

    public double getLongJumpDistance() {
        return longJumpDistance;
    }

    public void setLongJumpDistance(double longJumpDistance) {
        this.longJumpDistance = longJumpDistance;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "ElderlyPeople [name=" + name + ", age=" + age + ", longJumpDistance=" + longJumpDistance + "]";
    }


}
