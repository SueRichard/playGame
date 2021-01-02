package com.play;
import java.util.Scanner;
public final class TestGame implements Game{
	private Player player;
	private Computer comp;
	private int sum=0;
	{
		System.out.println("--��Ϸ��������--��--Ȱ��Ī����--");
		System.out.println("-----------------------------");
		System.out.println("---��ȭ����:1 ����  2 ʯͷ 3 ��---");
		System.out.println("---->>>>>��ȭ��ʼ>>>>>--------");
		System.out.println("-----------------------------");
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
		comp=new Computer();
		player=new Player();
		System.out.println(player.getName()+"\tVS\t"+comp.getName()+"��ս");
		
		game_continue();
	}
	public void game_continue(){
		System.out.println("Ҫ��ʼ��?(y/n)");
		Scanner input=new Scanner(System.in);
		String str=input.next();
		if(str.equals("y")){
			sum++;
			start();
		}else{
			if(sum==0){
				System.out.println("Bye Bye!��û��˼��������ˣ�");
				System.exit(0);
			}else{
				end();
			}
			
		}
	}
	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("���ȭ:1 ���� 2 ʯͷ 3 ��");
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
			
			game_response(player,"��Ӯ�ˣ���˧!");//��̬
		}else if(c==-1||c==2){
			
			game_response(comp,"�����ˣ��汿!");//��̬
		}else{
			System.out.println("�;֣���˥!");
		}
		game_continue();
	}
	/*
	 * ������������ظ�
	 * ���ö�̬�򻯴���
	 *���� player��computer�ĸ���
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
		System.out.println("��ս����:"+sum);
		System.out.println("����\t\t�÷�");
		System.out.println(player.getName()+"\t\t"+player.getScore()+"��");
		System.out.println(comp.getName()+"\t\t"+comp.getScore()+"��");
		System.exit(0);
	}
	
}
