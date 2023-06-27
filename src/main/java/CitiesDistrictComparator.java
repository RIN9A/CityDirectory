import java.util.Comparator;

public class CitiesDistrictComparator implements Comparator<City> {

    @Override
    public int compare(City o1, City o2) {
        int n = o1.getDistrict().compareTo(o2.getDistrict());
        if(n != 0){
            return n;
        }
        return o1.getName().compareTo(o2.getName());
    }

    @Override
    public Comparator<City> reversed() {
        return Comparator.super.reversed();
    }
}
