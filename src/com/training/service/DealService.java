package com.training.service;

import com.training.dao.DealDao;
import com.training.model.Deal;

public class DealService {

	public void addDeal(Deal deal) {
		DealDao.getInstance().addDeal(deal);
	}

	/*public void searchDeal(int id) {
		DealDao.getInstance().searchDeal(1);
	}*/

}
