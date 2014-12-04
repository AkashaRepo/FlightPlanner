import java.util.*;
import java.io.*;

public class AirportDriver{
  public static void main(String[] args) throws IOException {
    //for airports
    String fileName1 = "airportTester.txt";
    String fileName2 = "flightTester.txt";
    //while a fileName was entered
    try {
      Scanner scan1 = new Scanner(new FileReader(fileName1));
      Scanner scan2 = new Scanner(new FileReader(fileName2));
      Airport.makeAirports(scan1);
      (Airport.findAnAirportNamed("SEA")).printAirport();
      Flight.readLines(scan2);
      scan1.close();
      scan2.close();
      Airport.printAllAirports(); 
      //Flight.printAllFlights(Flight.getAvalFlights());
      }
    catch (Exception e){        
         //System.out.println("This file name can't be found. Enter a valid file name.");      
       }
    

  }
}
