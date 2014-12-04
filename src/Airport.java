
import java.util.*;

public class Airport{
  private String name;
  private double latitude;
  private double longitude;
  private int delay;
  private String city;
  private ArrayList<Flight> thisAirportsFlights;
  private static ArrayList<Airport> listOfAirports = new ArrayList<Airport>();


  public Airport(String nam, String lat, String longi, String del, String cit){
     name = nam;
     latitude = Double.parseDouble(lat);
     longitude = Double.parseDouble(longi);
     delay = Integer.parseInt(del);
     city = cit;
     thisAirportsFlights = new ArrayList<Flight>();
     listOfAirports.add(this);
  }
  
  
/*makeAirports takes in the file line by line and passes it to processLine to be turned into Airport objects */
  public static ArrayList<Airport> makeAirports(Scanner scan){ 
     while(scan.hasNext()){
       processLine(scan.nextLine()); 
     } 
     scan.close();
     return listOfAirports;
   }
  
//gets each position in the line and assigns it to an object
  public static Airport processLine(String line){
    String[] parts = line.split(",\\s{3,}");   
    Airport newObject = new Airport(parts[0], parts[1], parts[2], parts[3], parts[4]);
    return newObject;
  }
  
  //print the contents of the airport
  public void printAirport(){
    System.out.println("airport: " + name + "   latitude: " + latitude +
                       "   longitude: " + longitude + "   delay: " + delay + "   city: " + city);                    
    for(Flight s: thisAirportsFlights)
    s.printFlight();
  }
  
  public String toString(){
    return name+ " " + city;
  }
 
  //print allAirports (all the flights read in)
  public static void printAllAirports(){
    for(Airport s: listOfAirports){ 
       s.printAirport();
    }
  }
  
  public static Airport findAnAirportNamed(String a3){
    for (Airport ap: listOfAirports){
      if (ap.getAirportName().equals(a3)){
        return ap;
      } 
    }
    System.out.println("can't find: " + a3);
    return null;
  }
    
    
  //get methods
  public String getAirportName(){
    return name;
  }
  
  public double getLatitude(){
    return latitude;
  }
  
  public double getLongitude(){
    return longitude;
  }
  
  public int getDelay(){
    return delay;
  }
  
  public String getCity(){
    return city;
  }
  
  public ArrayList<Flight> getThisAirportsFlights(){
    return thisAirportsFlights;
  }
   
  //return the Arraylist of all the airports
  public static ArrayList<Airport> getListOfAirports(){
    return listOfAirports;
  }
  
  //set methods 
    public void setAirportName(String newName){
    name = newName;
  }
  
  public void setLatitude(double newLatitude){
    latitude = newLatitude;
  }
  
  public void setLongitude(double newLongitude){
    longitude = newLongitude;
  }
  
  public void setDelay(int newDelay){
    delay = newDelay;
  }
  
  public void setCity(String newCity){
    city = newCity;
  }
  
  public void addFlightToAirportArrayList(Flight object){
    thisAirportsFlights.add(object);
  }
    
}
  
  
