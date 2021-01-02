package com.play;
import java.util.Random;
import java.util.Scanner;
public class Computer extends Athlete{
	public Computer(){
		{
			System.out.println("请选择你的对手");
			System.out.println("1、马云  2、马化腾 3、马大姐");
			Scanner input=new Scanner(System.in);
			switch(input.nextInt()){
			case 1:
				setName("马云");
				break;
			case 2:
				setName("马化腾");
				break;
			case 3:
				setName("马大姐");
				break;
			}
		}
	}
	@Override
	public void chuquan() {
		// TODO Auto-generated method stub
		int a=new Random().nextInt(3)+1;
		setCh(a);
		super.chuquan();
	}
	
}
