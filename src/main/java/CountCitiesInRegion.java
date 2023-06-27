import java.util.HashMap;

public class CountCitiesInRegion {
    CityDirectory cityDirectory;

    public CountCitiesInRegion() {
    }

    public CountCitiesInRegion(CityDirectory cityDirectory) {
        this.cityDirectory = cityDirectory;
    }
    public HashMap<String, Integer> getRegionsCitiesCount(){
        HashMap<String, Integer> regionAndCities  = new HashMap<>();
        int k = 1;
        for (City c: this.cityDirectory.getCities()
             ) {
            if(regionAndCities.containsKey(c.getRegion())){
                regionAndCities.replace(c.getRegion(), regionAndCities.get(c.getRegion())+1);
            }else {
                regionAndCities.put(c.getRegion(), 1);
            }
        }
        return regionAndCities;
    }



}
