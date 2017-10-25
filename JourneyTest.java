package org.jitsville;

import java.util.ArrayList;
import java.util.List;

public class JourneyTest {

	public static void main(String args[])
	{
		/*
		 * 3 commuters, 2 of whom have frequent rider cards, 
		 * one for 3 stops and one for 5 stops. 
		 * The third commuter does not have a frequent rider card 
		 * and is going 4 stops and should have a newspaper.
		 */
		List<Commuter> commutersList = new ArrayList<Commuter>();
		Commuter com1 = new Commuter(3,true);
		commutersList.add(com1);
		Commuter com2 = new Commuter(5,true);
		commutersList.add(com2);
		Commuter com3 = new Commuter(4,false,true);
		commutersList.add(com3);
		/*
		 * 2 vacationers, 1 of which is traveling 90 miles 
		 * and the other traveling 199 miles and has a newspaper.
		 */
		List<Vacationer> vacationersList = new ArrayList<Vacationer>();
		Vacationer vac1=new Vacationer(90);
		vacationersList.add(vac1);
		Vacationer vac2=new Vacationer(199,true);
		vacationersList.add(vac2);
		
		//Calculate number of news papers,meals and total fare
		int totalNewsPapersRequired = 0;
		int totalNumberOfMealsRequired = 0;
		double totalFare =0;
		for(Commuter com:commutersList)
		{
			if(com.isNewsPaperRequested())
			{
				totalNewsPapersRequired++;
			}
			totalFare+=com.getFare();
		}
		for(Vacationer vac:vacationersList)
		{
			if(vac.isNewsPaperRequested())
			{
				totalNewsPapersRequired++;
			}
			totalNumberOfMealsRequired+=vac.getNumOfMealsRequired();
			totalFare+=vac.getFare();
		}
		
		System.out.println("Total number of News papaers required: "+totalNewsPapersRequired);
		System.out.println("Total number of Meals required: "+totalNumberOfMealsRequired);
		System.out.println("Total fare: "+totalFare);
		
	}
}
