package com.training.main;

import com.training.model.Deal;
import com.training.service.DealService;

public class MainClass {

	public static void main(String[] args) {

		Deal deal = new Deal();
		deal.setDealId("TF51234839");
		deal.setDealStepId("ISS00");
		
		DealService dealService = new DealService();
		dealService.addDeal(deal);
		System.out.println("Deal Added Successfully");
		
		/*dealService.searchDeal(1);
		System.out.println("Deal Search Successfully");*/
	}

}
