import java.util.*;
public class Dice{
	public int diceNumber;
	
	public Dice(){
		
		diceNumber=0;
	}
	
	public  int roll(){
		
		
		diceNumber =(new Random().nextInt(5)) + 1 ;
		
		return diceNumber;
		
	}
			
	
	
	
	
}