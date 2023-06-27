import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import java.util.Optional;

public class SortCityDirectory {
    CityDirectory cityDirectory;

    public SortCityDirectory(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }

    public ArrayList<City> sortedByNameReverse(){
        ArrayList<City> citiesByName = cityDirectory.getCities();
        citiesByName.sort(new CitiesNameComparator().reversed());
        return citiesByName;

    }
    public ArrayList<City> sortedByDistrictAndNameReverse(){
        ArrayList<City> citiesByDistrictAndName = cityDirectory.getCities();
        citiesByDistrictAndName.sort(new CitiesDistrictComparator().reversed());
        return citiesByDistrictAndName;
    }
    public HashMap<Integer, City> getCityMaxPopulation(){
        Optional<City> maxPopulation = this.cityDirectory.getCities().stream().max(new CitiesPopulationComparator());
        HashMap<Integer,City> cities = new HashMap<>();
        for (int i = 0; i < this.cityDirectory.getCities().size(); i++) {
            {
            assert maxPopulation.orElse(null) != null;
            if(Objects.equals(maxPopulation.orElse(null).getPopulation(), this.cityDirectory.getCities().get(i).getPopulation())){
                cities.put(i, this.cityDirectory.getCities().get(i));

            }
        }

    }
        return cities;
}
}
