package com.play;
import java.util.Random;
import java.util.Scanner;
public class Computer extends Athlete{
	public Computer(){
		{
			System.out.println("��ѡ����Ķ���");
			System.out.println("1������  2������ 3������");
			Scanner input=new Scanner(System.in);
			switch(input.nextInt()){
			case 1:
				setName("����");
				break;
			case 2:
				setName("����");
				break;
			case 3:
				setName("����");
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
