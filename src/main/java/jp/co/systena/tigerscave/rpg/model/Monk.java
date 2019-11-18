package jp.co.systena.tigerscave.rpg.model;

public class Monk extends Work {
	private String attack;
	private String portion;

	@Override
	public void fight() {
		// TODO 自動生成されたメソッド・スタブ
		attack = super.getName() + "は呪文で攻撃した！";

	}
	@Override
	public void cure() {
		// TODO 自動生成されたメソッド・スタブ
		portion = super.getName() + "は呪文で回復した！";
	}
	public String getAttack() {
		return attack;
	}

	public void setAttack(String attack) {
		this.attack = attack;
	}



	public String getPortion() {
		return portion;
	}

	public void setPortion(String portion) {
		this.portion = portion;
	}
}
