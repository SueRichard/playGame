package com.play;

public class Athlete {
	
	private String name;//protected 
	private int score;//protected
	private int ch;//���ӵĳ�Ա���� protected
	public Athlete(){
		
	}
	public int getCh() {
		return ch;
	}
	public void setCh(int ch) {
		this.ch = ch;
	}
	public Athlete(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return "Athlete [name=" + name + ", score=" + score + "]";
	}
	public void chuquan(){//���������
		switch(this.ch){
		case 1:
			System.out.println(name+"��ȭ������");
			break;
		case 2:
			System.out.println(name+"��ȭ��ʯͷ");
			break;
		case 3:
			System.out.println(name+"��ȭ����");
		}
	}
	
}
