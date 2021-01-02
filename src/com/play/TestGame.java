package com.play;
import java.util.Scanner;
public final class TestGame implements Game{
	private Player player;
	private Computer comp;
	private int sum=0;
	{
		System.out.println("--游戏仅供娱乐--，--劝君莫沉迷--");
		System.out.println("-----------------------------");
		System.out.println("---出拳规则:1 剪刀  2 石头 3 布---");
		System.out.println("---->>>>>猜拳开始>>>>>--------");
		System.out.println("-----------------------------");
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		comp=new Computer();
		player=new Player();
		System.out.println(player.getName()+"\tVS\t"+comp.getName()+"对战");
		
		game_continue();
	}
	public void game_continue(){
		System.out.println("要开始吗?(y/n)");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		if(str.equals("y")){
			sum++;
			start();
		}else{
			if(sum==0){
				System.out.println("Bye Bye!真没意思，真接走了！");
				System.exit(0);
			}else{
				end();
			}
			
		}
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("请出拳:1 剪刀 2 石头 3 布");
		player.chuquan();
		comp.chuquan();
		judge();
	}

	@Override
	public void judge() {
		// TODO Auto-generated method stub
		int player_num=player.getCh();
		int computer_num=comp.getCh();
		int c=player_num-computer_num;
	
		if(c==1||c==-2){
			
			game_response(player,"你赢了，真帅!");//多态
		}else if(c==-1||c==2){
			
			game_response(comp,"你输了，真笨!");//多态
		}else{
			System.out.println("和局，真衰!");
		}
		game_continue();
	}
	/*
	 * 上述代码过于重复
	 * 利用多态简化代码
	 *传入 player和computer的父类
	 */
	public void game_response(Athlete ath,String str){
		int ath_score=ath.getScore();
		ath_score++;
		ath.setScore(ath_score);
		System.out.println(str);
	}
	@Override
	public void end() {
		// TODO Auto-generated method stub
		System.out.println(comp.getName()+"\tVS\t"+player.getName());
		System.out.println("对战次数:"+sum);
		System.out.println("姓名\t\t得分");
		System.out.println(player.getName()+"\t\t"+player.getScore()+"分");
		System.out.println(comp.getName()+"\t\t"+comp.getScore()+"分");
		System.exit(0);
	}
	
}
