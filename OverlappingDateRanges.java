import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*; 

class DateRange {
	Date startDate;
	Date endDate;
}

public class OverlappingDateRanges {

	private static Scanner input;

	public static void main(String []args) throws ParseException{
		
		SimpleDateFormat sm = new SimpleDateFormat("mm-dd-yyyy");
		String str;
		int flag = 0;
    
	    DateRange dateRangeInput[];
	    dateRangeInput = new DateRange [20];
	
	    input = new Scanner(System.in);
	    System.out.println("Enter the number of date ranges :");

	    int num = input.nextInt();
	    for (int i = 0; i < num ; i++){
		    for (int j = 0; j < 2;  j++ ){
			    str = input.nextLine();
			    dateRangeInput[i].startDate = sm.parse(str);
			 
			    str = input.nextLine();
			    dateRangeInput[i].endDate = sm.parse(str);
		    }
	    }
		
		for (int i = 0 ; i < num ; i++) {
			for (int j = i+1 ; j < num ; j++) {
				/*
				 * Comparing the end date of range-1 with start date of range-2
				 * If former is greater that means, there is overlapping of days
				 */
				if(dateRangeInput[i].startDate.compareTo(dateRangeInput[i].endDate)>0){
					flag++;
					System.out.println("Overlapping date range - ");
					System.out.print("dateRangeInput[i], dateRangeInput[j]");
				}
			}
		}
		if (flag == 0){
			System.out.println("No overlapping date ranges");
		}
	}
}
