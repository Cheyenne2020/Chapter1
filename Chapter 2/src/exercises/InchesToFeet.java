package exercises;

public class InchesToFeet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numberOfFeet; 
		int numberOfInchesRemaining; 
		int numberOfInchesNeeded = 86; 
		int Inches_In_Feet = 12; 
		
		numberOfFeet = numberOfInchesNeeded / Inches_In_Feet; 
		numberOfInchesRemaining = numberOfInchesNeeded % Inches_In_Feet; 
		
		System.out.print("The total amount of feet is " + numberOfFeet); 
		
		System.out.print(" The total amount of inches is " + numberOfInchesRemaining);
		

	}

}
