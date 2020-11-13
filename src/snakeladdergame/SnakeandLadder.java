package snakeladdergame;

public class SnakeandLadder {

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		//int[] board = new int[101];
		new SnakeandLadder();
		SnakeandLadder.rollDice();
		
	}
	public static void rollDice() {
		int position = 0;
		int no_rolls = 0;
		while(position==100) {
			int Dice_value = (int)Math.floor((Math.random()*10 +1 )% 6);
			System.out.println("No_of_die_roll"+no_rolls+"Position ofthe player"+position);
			no_rolls=no_rolls+1;
			int option = (int)Math.floor((Math.random()*10 +1 )% 3);
			switch(option) 
			{
				case 0:
					System.out.println("Nopaly");			
					break;
			//Ladder
				case 1:
					if(position+Dice_value<=100)
					{
						position = position + Dice_value;
						break;
					}
					else
					{
						position=0;
						break;
					}
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
		System.out.println("number of die roll "+no_rolls+" position of player:"+position);

	}
}
