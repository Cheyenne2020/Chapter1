package exercises;

public class QuartsToGallons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfGallons; 
		int numberOfQuartsRemaining; 
		int numberOfQuartsNeeded = 18; 
		int Quarts_In_Gallons = 4; 
		
		numberOfGallons = numberOfQuartsNeeded / Quarts_In_Gallons; 
		numberOfQuartsRemaining = numberOfQuartsNeeded % Quarts_In_Gallons; 
		
		System.out.print("The total amount of gallons is " + numberOfGallons); 
		
		System.out.print(" The total amount of quarts is " + numberOfQuartsRemaining); 
	
			}

}
