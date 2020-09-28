package sourceCode;

import java.util.Map;

public class PromotionEngineDiscountCalculator {

	Map<Character, Double> itemListPrice = PromotionEngineItemList.getItemList();

	private Integer remainingPacketsInA = 0;

	private Integer discountforA = 0;

	private double total = 0.00;

	public double calculateDiscount(Map<Character,Integer> itemSold) {
		
		itemListPrice.get('A');
		
		if(itemSold.containsKey('A')) {
			Integer ATotalItems = itemSold.get('A');
			if(ATotalItems > 0) {
				remainingPacketsInA = ATotalItems%3;
				total = total + remainingPacketsInA*itemListPrice.get('A');
			}			
			if(ATotalItems > 3) {
				discountforA  = ATotalItems/3;	
				total = total + discountforA*130;
			}
		
		}
		
		
		
		return total;
			
	}

}
