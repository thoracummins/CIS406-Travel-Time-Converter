//Thora Cummins
//CIS406
//Travel Time Converter

package travelTimeConverter;
import java.util.Scanner;

public class TravelTimeConverter {

	//Vars
	int miles;
	int mph;
	float time;
	int hours;
	int minutes;

	// Calculate Hours and Minutes
	public void  calculateTime()
	{
		getMiles();
		getMPH();
		
		time = (float)miles/mph;  // calc time
		hours = (int)miles/mph;  // pull out hours
		minutes = (int)Math.round((time - hours)*60);  // pull out minutes
	}
	
	// Enter Miles Value
	public void getMiles()
	{
		// Enter Miles
		Scanner dataObj = new Scanner(System.in);
		System.out.println("Enter Miles: ");
		
		miles = dataObj.nextInt();
	}
	
	// Enter Miles Per Hour
	public void getMPH()
	{
		// Miles per Hour
		Scanner dataObj = new Scanner(System.in);
		System.out.println("Enter Miles Per Hour: \n");
		
		mph = dataObj.nextInt();
		
		dataObj.close();
	}

	public void printOut()
	{
		System.out.println("Welcomm to the Travel Time Calculator \n");
		
		calculateTime();
		
		System.out.println("Estimated travel time:");
		System.out.println("----------------------");
		System.out.println("Hours:     "+hours);
		System.out.println("Minutes:   "+minutes);
		
		System.out.println("Bye!!");
	}
	// ---------------------------------------------------------
	public static void main(String[] args)
	{
		TravelTimeConverter ttc = new TravelTimeConverter();
		
		ttc.printOut();

	}

}
