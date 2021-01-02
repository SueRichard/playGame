package com.play;
import java.util.Scanner;
public class Player extends Athlete{
	public Player(){
		{
			System.out.println("ÇëÊäÈëÄãµÄĞÕÃû");
			Scanner input=new Scanner(System.in);
			setName(input.next());
		}
	}
	@Override
	public void chuquan() {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		setCh(input.nextInt());
		super.chuquan();
	}
	
	
}
