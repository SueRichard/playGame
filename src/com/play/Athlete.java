package com.play;

public class Athlete {
	
	private String name;//protected 
	private int score;//protected
	private int ch;//增加的成员变量 protected
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
	public void chuquan(){//增加耦和性
		switch(this.ch){
		case 1:
			System.out.println(name+"出拳：剪刀");
			break;
		case 2:
			System.out.println(name+"出拳：石头");
			break;
		case 3:
			System.out.println(name+"出拳：布");
		}
	}
	
}
