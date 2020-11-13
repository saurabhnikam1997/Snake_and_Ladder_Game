package snakeladdergame;

public class SnakeandLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		//int[] board = new int[101];
		new SnakeandLadder();
		SnakeandLadder.rollDice();
		
	}
	public static void rollDice() {
		
		int Dice_value = (int)Math.floor((Math.random()*10 +1 )% 6);
		System.out.println(Dice_value);
		int position = 0;
		while(position==100) {
			int option = (int)Math.floor((Math.random()*10 +1 )% 3);
			System.out.println(option);

			switch(option) 
			{
				case 0:
					System.out.println("Nopaly");			
					break;
			//Ladder
				case 1:
					position = position + Dice_value;
					System.out.println(position);
					break;
			//snake
				case 2:
						if(position>0 )
						{
							position = position - Dice_value;
							System.out.println(position);
							break;
						}
						else
						{	
							position=0;
							break;
						}
				default:
					System.out.println("Invalid Operation");;
					break;	
			}
		}
	}
}
