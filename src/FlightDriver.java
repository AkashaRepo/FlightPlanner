import java.util.*;
import java.io.*;

public class FlightDriver{
  public static void main(String[] args) throws IOException {
    String fileName;
    Scanner nameReader = new Scanner(System.in);
    System.out.println("Enter a file name");
    
    //while a fileName was entered
    try {
      fileName = nameReader.nextLine();
      Scanner scan = new Scanner(new FileReader(fileName));
      Flight.readLines(scan);
      Flight.printAllFlights(Flight.getAvalFlights());
      
      }
    catch (Exception e){        
         System.out.println("This file name can't be found. Enter a valid file name.");      
       }
    
    nameReader.close(); 
  }
}
