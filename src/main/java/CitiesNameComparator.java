import java.util.Comparator;

public class CitiesNameComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        return o1.getName().compareToIgnoreCase(o2.getName());
    }
    @Override
    public Comparator<City> reversed() {
        return Comparator.super.reversed();
    }
}
