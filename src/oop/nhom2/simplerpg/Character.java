package oop.nhom2.simplerpg;

import java.awt.Point;

public abstract class Character {
	private Long id;
	private String name;
	private int hp;
	private int mp;
	private int damage;
	private int[] stats;

	private int maxHp;
	private int maxMp;

	public Character() {
		// TODO Auto-generated constructor stub
	}

	public Character(Long id, int maxHp, int maxMp) {
		this.id = id;
		this.maxHp = maxHp;
		this.maxMp = maxMp;
	}

	public abstract Point move(int direction);

	public abstract int attack();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int[] getStats() {
		return stats;
	}

	public void setStats(int[] stats) {
		this.stats = stats;
	}

	public int getMaxHp() {
		return maxHp;
	}

	public void setMaxHp(int maxHp) {
		this.maxHp = maxHp;
	}

	public int getMaxMp() {
		return maxMp;
	}

	public void setMaxMp(int maxMp) {
		this.maxMp = maxMp;
	}

}
