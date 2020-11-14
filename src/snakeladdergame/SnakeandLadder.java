package snakeladdergame;

public class SnakeandLadder {
	
	private static int position_of_player1=0;
	private static int position_of_player2=0;
	private static int no_of_die_rolls=0;
	private static int die_value;
	private  static int values=0;
	private static int play(int value) 
	 {
		values=value;
		if(values<100) 
		{
			die_value=die_roll();
			no_of_die_rolls=no_of_die_rolls+1;
			int option=(int)Math.floor((Math.random()*10)% 3);
			switch(option) 
			{
			case 0:
					break;
			case 1: 
					ladder();
					break;
			case 2:  
					snake();
					break;
			default:
					System.out.println("Something unexpected happen: ");
			}
		}
		return values;
	 }
	private static void snake() 
	{
		if(values>die_value && values>0) 
			values=values-die_value;
		else
			values=0;
	}
	private static int die_roll() 
	{
		die_value=(int)Math.floor((Math.random()*10 +1 )% 6);
		return die_value;
	}
	private static void ladder()
	{	
		if(values+die_value<100) 
		{
			values=values+die_value;
			if(values<100)
			{
				die_value=die_roll();
				if(values+die_value<=100)
				values=values+die_value;
			}
		}
	}
	public static void main(String[] args)
	{
		while(position_of_player1<100 && position_of_player2<100) 
		{
			position_of_player1=play(position_of_player1);
			System.out.println("number of die roll "+no_of_die_rolls+" position of player1: "+position_of_player1);
			position_of_player2=play(position_of_player2);	
			System.out.println("number of die roll "+no_of_die_rolls+" position of player2: "+position_of_player2);
		}
		if(position_of_player1==100)
			System.out.println("player 1 is winner");
		else
			System.out.println("player2 is winner");
	}
}