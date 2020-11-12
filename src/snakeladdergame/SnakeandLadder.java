package snakeladdergame;

import java.util.Random;

public class SnakeandLadder {
	
	static int[] board = new int[101];
	int Startposition = 0;
	int Endposition = 100;
	static int Dice_value =0;
	
	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		new SnakeandLadder();
	//	SnakeandLadder.board();
		SnakeandLadder.showboard(board);
		SnakeandLadder.rollDice();
	}

	private static void showboard(int[] board) {
		System.out.println("Snake and Ladder Game Board");		
	}
	
	public static void rollDice() {
		Random random = new Random();
		Dice_value = random.nextInt(6) + 1;
		System.out.println(Dice_value);		
	}
}
