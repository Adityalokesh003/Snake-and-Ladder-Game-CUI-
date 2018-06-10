public class SnakeGameBoard{
	
	int []num=new int[100];
	boolean leftToRightDirection = false;
// constructor to create snake-board when SnakeGameBoard object created
	public SnakeGameBoard() {
		 
    // array of 100 numbers from 1-100
 	for(int i=num.length;i>=1;i--){
		num[i-1] = i;
 	}
	
	// creating board pattern
		
		System.out.print("\n\n         ");
	 
	 for(int row=10;row>=1;row--){
		 // for 100-91 or 80-71 or 60-51 etc
		if(leftToRightDirection==false){
			for(int position=10;position>=1;position--){
				
			if((10*(row-1)+position)==13){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			
			if((10*(row-1)+position)==32){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==35){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==71){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==39){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==98){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==57){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
			if((10*(row-1)+position)==75){
				System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else{
			System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);

			}
			
		  }
		  leftToRightDirection= (!leftToRightDirection);
 			
		}
		// for 81-90 or 61-70 or 41-50 etc
		else{
			for(int position=1;position<=10;position++){
			if((10*(row-1)+position)==25){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else
 			if((10*(row-1)+position)==62){
				System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
			}
			
			else{
				System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
				
			}
			 
		  }
			leftToRightDirection= (!leftToRightDirection);
			
			
			
		}
		System.out.print("\n\n\n         ");

	 }// big for loop end
	 
	}// constructor end
	
// a method to show player positions on snake-board	
 	public  void showBoardWithPlayers(Player a,Player b){
	  
		leftToRightDirection = false;
		  
		int positionOfplayer1 =a.boardPosition;
		int positionOfplayer2 =b.boardPosition;
		
	   
		 System.out.print("\n\n         ");
		 for(int row=10;row>=1;row--){
			 
// for 100-91 or 80-71 or 60-51 etc
			if(leftToRightDirection==false){
			
				for(int position=10;position>=1;position--){
//ladder snake positions
					if((10*(row-1)+position)==13){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
 					if((10*(row-1)+position)==32){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==35){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==71){
						System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==39){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==98){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==75){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
					
					else
					if((10*(row-1)+position)==57){
						System.out.printf("[ $"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
// players A B positions
					
					// when only A comes in  current position
				else{
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 != 10*(row-1)+position) ){
						System.out.printf("["+"A"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					
					// when only B comes in  current position
					else 
					if( (positionOfplayer1 != 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"B"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					
					// when  A & B comes in  current position
					else 
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"AB"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					// when  none comes in current position
					else{
						System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
					}
		   
				}
			
			}
			leftToRightDirection= (!leftToRightDirection);
 			
		}


		
// for 81-90 or 61-70 or 41-50 etc
		else{
			for(int position=1;position<=10;position++){
// for ladder and snake positions		    
				if((10*(row-1)+position)==25){
					System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
				} 
				
				else
 				if((10*(row-1)+position)==62){
					System.out.printf("[ #"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
				}
// for player A B positions			
				else{
					
					// when only A comes in  current position
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 != 10*(row-1)+position) ){
					System.out.printf("["+"A"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
					continue;
					}
					// when only B comes in  current position
					else 
					if( (positionOfplayer1 != 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"B"+"%4d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					// when  A and B comes in  current position
					else 
					if( (positionOfplayer1 == 10*(row-1)+position) && (positionOfplayer2 == 10*(row-1)+position) ){
						System.out.printf("["+"AB"+"%3d"+" ]   ",num[(10*(row-1)+position)-1]);
						continue;
					}
					// when  none comes in  current position
					else{
						System.out.printf("["+"%5d"+" ]   ",num[(10*(row-1)+position)-1]);
					}

			
				}
		}
		
		leftToRightDirection= (!leftToRightDirection);
			
			
			
	}
	System.out.print("\n\n\n         ");

	 }
		
	 System.out.print("A POSITION = "+positionOfplayer1+"\t");	
	 System.out.print("B POSITION = "+positionOfplayer2);	
 		
	 
	
	}
	 
	 
	 
}

