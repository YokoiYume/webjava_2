package jp.co.systena.tigerscave.rpg.model;

public abstract class Work {

	private String name;
	private String work;

	public abstract void fight();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public abstract void cure();

}
