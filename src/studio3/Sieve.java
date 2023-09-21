package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("What is user's number? ");
		int n = in.nextInt();
		
		
		boolean[] number = new boolean[n + 1]; 
		number[0] = false;
		number[1] = false;
		
		for (int i = 2 ; i< number.length; i++)
		{
			number[i] = true;
		}
		for (int factor=2 ; factor<=Math.pow(n,0.5);factor++)
				{
			for (int mult=2*factor; mult<number.length; mult +=factor) {
				number[mult] = false;
			
		}
		
	}for (int i = 2 ; i< number.length; i++)
	{
		number[i] = true;
		if (number[i]) {
			System.out.println(i);
		}
	}
		}	
		
		
		
	}


