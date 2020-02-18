package com;

public class ship extends autoMobile implements swim{
int shipNo;@Override
public String toString() {
	return "ship [shipNo=" + shipNo + ", shipName=" + shipName + "]";
}
String shipName;
public ship(int shipNo, String shipName) {
	super();
	this.shipNo = shipNo;
	this.shipName = shipName;
}

public int getShipNo() {
	return shipNo;
}
public void setShipNo(int shipNo) {
	this.shipNo = shipNo;
}
public String getShipName() {
	return shipName;
}
public void setShipName(String shipName) {
	this.shipName = shipName;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	@Override
	public int swimspeed(int a) {
		// TODO Auto-generated method stub
		return a;
	}

}
