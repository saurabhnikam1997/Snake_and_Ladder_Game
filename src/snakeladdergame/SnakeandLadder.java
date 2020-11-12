package snakeladdergame;

public class SnakeandLadder {
	
	static int[] board = new int[101];
	int Startposition = 0;
	int Endposition = 100;
	

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		new SnakeandLadder();
	//	SnakeandLadder.board();
		SnakeandLadder.showboard(board);
		
	}


	private static void showboard(int[] board) {
		System.out.println("Snake and Ladder Game Board");
		
	}
}
