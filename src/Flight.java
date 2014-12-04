

/*
 * Flights have have a name which consists of an operator and a number.
 * Flights contain four variables, an origin, a destination, a departure time, and an arrival time.
 * They might also have a ticket price.
 */


  
import java.util.*;
public class Flight{
  
  private int flightNumber;
  private Airport origin;
  private Airport destination;
  private int departure;
  private int arrival;
  private double price;
  private int numOfSeats; 
  private String airline;
  private String layovers;
  private static ArrayList<Flight> avalFlights = new ArrayList<Flight>(); //availible flights
  
  public Flight(String flightNum, String orig, String dest, String dep, String arr, String pri, String numOfS, String ai, String la){
    flightNumber = Integer.parseInt(flightNum);
    origin = Airport.findAnAirportNamed(orig);
    destination = Airport.findAnAirportNamed(dest);
    departure = Integer.parseInt(dep);
    arrival = Integer.parseInt(arr);
    price = Double.valueOf(pri);
    numOfSeats = Integer.parseInt(numOfS);
    airline = ai;
    layovers = la;
    avalFlights.add(this);
  }
  
  //print the contents of the object
  public void printFlight(){
    System.out.println("flight number: " + this.flightNumber + "   origin: " + (this.origin).getAirportName()  + "   destination: " + 
                       (this.destination).getAirportName() + "   departure: " + this.departure + "   arrival: " + this.arrival + "   price " + this.price
                       + "   number of seats remaining: " + this.numOfSeats + "   airline: " + this.airline+ "   layovers: " + this.layovers);
  }
 
  //print avalFlights (all the flights read in)
  public static void printAllFlights(ArrayList<Flight> flights){
    for(Flight s: flights){ 
       s.printFlight();
    }
  }
  
    
/*readLines takes in the file line by line and passes it to processLine to be turned into objects, 
  then it takes those objects and turns them into an ArrayList to be returned to the main method and stored in a temp arrayList */
  public static void readLines(Scanner scan){ 
     while(scan.hasNext()){
       processLine(scan.nextLine());
     }
     scan.close();
   }
  
  
  //gets each position in the line and assigns it to an object
  private static Flight processLine(String line){
    StringTokenizer str = new StringTokenizer(line, " ,!?.;");
    Flight newObject = new Flight(str.nextToken(), str.nextToken(), str.nextToken(), str.nextToken(), str.nextToken(), str.nextToken(), str.nextToken(), str.nextToken(), "none");
    //finds the flight origin and destination and goes to those airports and updates their lists to include that flight
    (newObject.getOrigin()).addFlightToAirportArrayList(newObject);
    (newObject.getDestination()).addFlightToAirportArrayList(newObject);
    return newObject;
  }

  //get methods
  public int getFlightNumber(){
    return flightNumber;
  }
  
  public Airport getOrigin(){
    return origin;
  }
  
  public Airport getDestination(){
    return destination;
  }
  
  public int getDeparture(){
    return departure;
  }
  
  public int getArrival(){
    return arrival;
  }
  
  public double getPrice(){
    return price;
  }
  
  public int getNumOfSeats(){
    return numOfSeats;
  }
  
  public String getAirline(){
    return airline;
  }
  
  public String getLayovers(){
    return layovers;
  }
  
  //return the list of all the flights
  public static ArrayList<Flight> getAvalFlights(){
    return avalFlights;
  }
  
  public String toString(){
    return origin.toString() + "-->" + destination.toString();
  }
  
  //set methods 
  public void setFlightNumber(int num){
    this.flightNumber = num;
  }
  
  public void setOrigin(Airport org){
    this.origin = org;
  }
 
  public void setDestination(Airport dest){
    this.destination = dest;
  }
  
  public void setDeparture(int depart){
    this.departure = depart;
  }
  
  public void setArrival(int arrive){
    this.arrival = arrive;
  }
  
  public void setPrice(double pr){
    this.price = pr;
  }
  
  public void setNumOfSeats(int numS){
    this.numOfSeats = numS;
  }
  
  public void setAirline(String airl){
    this.airline = airl;
  }
  
  public void setLayovers(String lay){
    this.layovers = lay;
  }
}
  
  
