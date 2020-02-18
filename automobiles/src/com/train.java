package com;

public class train extends autoMobile implements runable {
int trainNo;
@Override
public String toString() {
	return "train [trainNo=" + trainNo + ", trainName=" + trainName + "]";
}

String trainName;
public train(int trainNo, String trainName) {
	super();
	this.trainNo = trainNo;
	this.trainName = trainName;
}


public int getTrainNo() {
	return trainNo;
}
public void setTrainNo(int trainNo) {
	this.trainNo = trainNo;
}
public String getTrainName() {
	return trainName;
}
public void setTrainName(String trainName) {
	this.trainName = trainName;
}


@Override
public int run(int a) {
	// TODO Auto-generated method stub
	return a;
}




}
