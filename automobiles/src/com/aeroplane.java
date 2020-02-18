package com;

public class aeroplane extends autoMobile implements fly {
	int planeNo;
	String planeName;

	@Override
	public String toString() {
		return "aeroplane [planeNo=" + planeNo + ", planeName=" + planeName + "]";
	}

	public aeroplane(int planeNo, String planeName) {

		super();
		this.planeNo = planeNo;
		this.planeName = planeName;
	}

	public int getPlaneNo() {
		return planeNo;
	}

	public void setPlaneNo(int planeNo) {
		this.planeNo = planeNo;
	}

	public String getPlaneName() {
		return planeName;
	}

	public void setPlaneName(String planeName) {
		this.planeName = planeName;
	}

	@Override
	public int fly(int a) {
		// TODO Auto-generated method stub
		return a;
	}

	
}
