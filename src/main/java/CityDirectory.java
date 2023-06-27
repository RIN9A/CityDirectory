import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CityDirectory  {
    private ArrayList<City> cities;

    public CityDirectory() {
        this.cities = new ArrayList<>();
    }

    public CityDirectory(ArrayList<City> cities) {
        this.cities = cities;
    }

    public ArrayList<City> getCities() {
        return cities;
    }

    public void setCities(ArrayList<City> cities) {
        this.cities = cities;
    }
    public void addCitiesFromFile(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNext()){
            String[] str = scanner.nextLine().split(";");
            this.cities.add(initCity(str));
        }
    }


    private City initCity(String[] str){
        City city = new City() ;
        if(str.length > 5){
            city.setName(str[1]);
            city.setRegion(str[2]);
            city.setDistrict(str[3]);
            city.setPopulation(Integer.parseInt(str[4]));
            city.setFoundation(str[5]);}
        else{
            city.setName(str[1]);
            city.setRegion(str[2]);
            city.setDistrict(str[3]);
            city.setPopulation(Integer.parseInt(str[4]));}
        return city;
    }






}
