import javax.naming.ldap.HasControls;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        CityDirectory cityDirectory = new CityDirectory();
        cityDirectory.addCitiesFromFile("Задача ВС Java Сбер.csv");
        SortCityDirectory sortCityDirectory = new SortCityDirectory(cityDirectory);
        printArrays(sortCityDirectory.sortedByNameReverse());
        printArrays(sortCityDirectory.sortedByDistrictAndNameReverse());
        printMap(sortCityDirectory.getCityMaxPopulation());

        CountCitiesInRegion countCitiesInRegion = new CountCitiesInRegion(cityDirectory);
        for (String region: countCitiesInRegion.getRegionsCitiesCount().keySet()
             ) {
            System.out.println(region + " - " +countCitiesInRegion.getRegionsCitiesCount().get(region));
        }
    }

    public static void printArrays(ArrayList<City> cities){
        for (City c: cities) {System.out.println(c);}
    }
    public static void printMap(HashMap<Integer, City> cities){
        for (int i = 0; i < cities.size(); i++) {
            City c = (City) cities.values().toArray()[i];
            System.out.println("["+cities.keySet().toArray()[i] + "] = " + c.getPopulation());

        }
    }

}