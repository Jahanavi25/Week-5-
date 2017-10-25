package org.jitsville;

public class Commuter {

	int numOfStops;
	boolean isFrequentRiderCardHolder;
	boolean isNewsPaperRequested;
	public Commuter(int numOfStops, boolean isFrequentRiderCardHolder, boolean isNewsPaperRequested) {
		this.numOfStops = numOfStops;
		this.isFrequentRiderCardHolder = isFrequentRiderCardHolder;
		this.isNewsPaperRequested = isNewsPaperRequested;
	}
	public Commuter(int numOfStops, boolean isFrequentRiderCardHolder) {
		this.numOfStops = numOfStops;
		this.isFrequentRiderCardHolder = isFrequentRiderCardHolder;
		this.isNewsPaperRequested = false;
	}
	public boolean isFrequentRiderCardHolder() {
		return isFrequentRiderCardHolder;
	}
	public void setFrequentRiderCardHolder(boolean isFrequentRiderCardHolder) {
		this.isFrequentRiderCardHolder = isFrequentRiderCardHolder;
	}
	public boolean isNewsPaperRequested() {
		return isNewsPaperRequested;
	}
	public void setNewsPaperRequested(boolean isNewsPaperRequested) {
		this.isNewsPaperRequested = isNewsPaperRequested;
	}
	public int getNumOfStops() {
		return numOfStops;
	}
	public double getFare()
	{
		double fare = numOfStops*0.5;
		if(isFrequentRiderCardHolder)
		{
			//10% discount
			fare=fare*0.9;
		}
		return fare;
	}
}
