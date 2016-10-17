package oop.nhom2.simplerpg;

import java.awt.Point;

public class NPC extends Character {
	private boolean hostile;
	private String[] dialog;
	
	NPC(){
		super();
	}
	
	public void setHostile(boolean hostile){
		this.hostile = hostile;
	}
	
	public boolean getHostile(){
		returm this.hostile;
	}
	public void setDialog(String[] dialog){
		this.dialog = dialog.clone();
	}
	
	public String[] getDialog(){
		return dialog;
	}
	
	@Override
	public void attack(){
		
	}
	
	@Override
	public Point move(int direction){
		
		return null;
	}

}

