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

	// calulate minutes
	public void calculateHoursMinutes()
	{
		
	}
	
	// Calculate Hours and Minutes
	public void  calculateTime()
	{
		getMiles();
		getMPH();
		
		time = (float)miles/mph;
		hours = (int)miles/mph;
		minutes =  60*(miles % mph);
		System.out.println("Time is = "+time);
		System.out.println("Hours is "+hours);
		System.out.println("Minutes is "+minutes);
		
		calculateHoursMinutes();
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
		System.out.println("Enter Miles Per Hour: ");
		
		mph = dataObj.nextInt();
		
		dataObj.close();
	}

	// ---------------------------------------------------------
	public static void main(String[] args)
	{
		TravelTimeConverter ttc = new TravelTimeConverter();
		
		ttc.calculateTime();

	}

}
