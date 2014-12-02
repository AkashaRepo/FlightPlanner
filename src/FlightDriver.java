import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class FlightDriver{
  public static void main(String[] args) throws IOException {
    String fileName;
    Scanner nameReader = new Scanner(System.in);
    System.out.println("Enter a file name");
    //while a fileName was entered
    try {
      fileName = nameReader.nextLine();
      scan = new Scanner(new FileReader(fileName));
      ArrayList<Flight> allFlights = new ArrayList<Flight>();
      allFlights = Flight.readLines(scan);
      Itinerary.makeCostItin(allFlights);
      }
    catch (Exception e){        
         System.out.println("This file name can't be found. Enter a valid file name.");      
       }
    nameReader.close(); 
  }
}
