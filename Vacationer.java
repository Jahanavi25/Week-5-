package org.jitsville;

public class Vacationer {

	int numOfMiles;
	boolean newsPaperRequested;
	public Vacationer(int numOfMiles, boolean newsPaperRequested) {
		if(numOfMiles<5 || numOfMiles>4000)
		{
			throw new IllegalArgumentException("Number of Miles should be between 5 to 4000 for a vacationer");
		}
		this.numOfMiles = numOfMiles;
		this.newsPaperRequested = newsPaperRequested;
	}
	public Vacationer(int numOfMiles) {
		if(numOfMiles<5 || numOfMiles>4000)
		{
			throw new IllegalArgumentException("Number of Miles should be between 5 to 4000 for a vacationer");
		}
		this.numOfMiles = numOfMiles;
		this.newsPaperRequested = false;
	}
	public boolean isNewsPaperRequested() {
		return newsPaperRequested;
	}
	public void setNewsPaperRequested(boolean newsPaperRequested) {
		this.newsPaperRequested = newsPaperRequested;
	}
	public int getNumOfMiles() {
		return numOfMiles;
	}
	public int getNumOfMealsRequired()
	{
		if(numOfMiles>=185)
			return 2;
		else if(numOfMiles>=100)
			return 1;
		else
			return 0;
	}
	public double getFare()
	{
		return numOfMiles*0.5;
	}
}
