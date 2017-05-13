package com.training.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.MapUtils;

import com.training.model.Deal;

public class DealDao {

	private static List<Deal> DEALS = new ArrayList<Deal>();
	private static Map<Integer, Deal> DEALS_MAP = new HashMap<Integer, Deal>();
	
	private static final DealDao INSTANCE = new DealDao();
	private static Integer SEQUENCE = 0;
	
	private DealDao() {}
	
	public static DealDao getInstance() {
		return INSTANCE;
	}
	
	public void addDeal(Deal deal) {
		deal.setId(++SEQUENCE);
		DEALS.add(deal);
	}

	public Deal searchDeal(int id) {
		if(MapUtils.isNotEmpty(DEALS_MAP)) {
			if(DEALS_MAP.containsKey(id)) {
				return DEALS_MAP.get(id);
			}
		}
		
		return null;
	}

}
