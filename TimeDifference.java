// TimeDifference.java
// Rowan Rice
// September 16, 2019

import java.util.Scanner;

public class TimeDifference 
{
	public static void main(String [] args)
	{
		final int HUNTHOUSANDS = 100000;
		final int TENTHOUSANDS = 10000;
		final int THOUSANDS	= 1000;
		final int HUNDREDS = 100;
		final int TENS = 10;

		final int SECONDS_IN_HOUR = 3600;
		final int SECONDS_IN_MIN = 60;
		

		Scanner input = new Scanner(System.in);

		int enteredTime, firstTimeInSec, secondTimeInSec;

		//bring in the first time
		System.out.print("Enter a time (HHMMSS): ");

		enteredTime = input.nextInt();

		// break up time into digits
		int firstDig, secondDig, thirdDig, fourthDig, fifthDig, sixthDig;

		// isolate first digit 
		firstDig = enteredTime / HUNTHOUSANDS;
		
		// update time to what's left after isolating first digit
		enteredTime = enteredTime % HUNTHOUSANDS;

		// isolate second digit of original time
		secondDig = enteredTime / TENTHOUSANDS;
	
		// update time to what's left after isolating second digit
		enteredTime = enteredTime % TENTHOUSANDS;

		// isolate third digit of original time
		thirdDig = enteredTime / THOUSANDS;

		// update time to what's left after isolating third digit
		enteredTime = enteredTime % THOUSANDS;

		// isolate fourth digit of original time
		fourthDig = enteredTime / HUNDREDS;

		// update time to what's left after isolating fourth digit
		enteredTime = enteredTime % HUNDREDS;

		// isolate fifth digit of original time
		fifthDig = enteredTime / TENS;

		// sixth digit is what's left after isolating fifth digit
		sixthDig = enteredTime % TENS;

		// convert digits into hours, minutes and seconds
		// and convert hours and minutes into seconds
		// then add all seconds together

		int numHrs, numMin, numSec;
	
		numHrs = (firstDig * TENS) + secondDig;

		numHrs = numHrs * SECONDS_IN_HOUR;

		numMin = (thirdDig * TENS) + fourthDig;

		numMin = numMin * SECONDS_IN_MIN;

		numSec = (fifthDig * TENS) + sixthDig;

		firstTimeInSec = numHrs + numMin + numSec;


		// do it again for the second time
		System.out.print("Enter a second time (HHMMSS): ");

		enteredTime = input.nextInt();

		// isolate first digit 
		firstDig = enteredTime / HUNTHOUSANDS;
		
		// update time to what's left after isolating first digit
		enteredTime = enteredTime % HUNTHOUSANDS;

		// isolate second digit of original time
		secondDig = enteredTime / TENTHOUSANDS;
	
		// update time to what's left after isolating second digit
		enteredTime = enteredTime % TENTHOUSANDS;

		// isolate third digit of original time
		thirdDig = enteredTime / THOUSANDS;

		// update time to what's left after isolating third digit
		enteredTime = enteredTime % THOUSANDS;

		// isolate fourth digit of original time
		fourthDig = enteredTime / HUNDREDS;

		// update time to what's left after isolating fourth digit
		enteredTime = enteredTime % HUNDREDS;

		// isolate fifth digit of original time
		fifthDig = enteredTime / TENS;

		// sixth digit is what's left after isolating fifth digit
		sixthDig = enteredTime % TENS;

		// convert digits into hours, minutes and seconds
		// and convert hours and minutes into seconds
		// then add all seconds together
	
		numHrs = (firstDig * TENS) + secondDig;

		numHrs = numHrs * SECONDS_IN_HOUR;

		numMin = (thirdDig * TENS) + fourthDig;

		numMin = numMin * SECONDS_IN_MIN;

		numSec = (fifthDig * TENS) + sixthDig;

		secondTimeInSec = numHrs + numMin + numSec;

		// subtract second time from first time
		int timeDiff = firstTimeInSec - secondTimeInSec;

		// now convert time difference back to HHMMSS format
		int diffNumHr, diffNumMin, diffNumSec, answer;

		diffNumHr = timeDiff / SECONDS_IN_HOUR;

		timeDiff = timeDiff % SECONDS_IN_HOUR;

		diffNumMin = timeDiff / SECONDS_IN_MIN;

		timeDiff = timeDiff % SECONDS_IN_MIN;

		diffNumSec = timeDiff; //all that's left are seconds

		// now convert digits into HHMMSS format
		answer = (diffNumHr * TENTHOUSANDS) + (diffNumMin * HUNDREDS) + 
			(diffNumSec);

		System.out.println("Time difference: " + answer);


	}
}