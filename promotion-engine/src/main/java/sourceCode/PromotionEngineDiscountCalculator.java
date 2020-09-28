package sourceCode;

import java.util.Map;

public class PromotionEngineDiscountCalculator {

	Map<Character, Double> itemListPrice = PromotionEngineItemList.getItemList();

	private Integer remainingPacketsInA = 0;

	private Integer discountforA = 0;

	private double total = 0.00;

	private Integer remainingPacketsInB = 0;

	private Integer discountforB = 0;

	private Integer remainingPackets = 0;;

	public double calculateDiscount(Map<Character,Integer> itemSold) {
		for (Map.Entry<Character,Integer> entry : itemSold.entrySet()) {  

		if(entry.getKey().equals('A')) {
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
		
		else if(entry.getKey().equals('B')) {
			Integer BTotalItems = itemSold.get('B');
			if(BTotalItems > 0) {
				remainingPacketsInB = BTotalItems%2;
				total = total + remainingPacketsInB*itemListPrice.get('B');
			}			
			if(BTotalItems > 2) {
				discountforB  = BTotalItems/2;	
				total = total + discountforB*45;
			}
			
		}
		
		else if(entry.getKey().equals('C') && itemSold.containsKey('D')) {
			Integer CTotalItems = itemSold.get('C');
			Integer DTotalItems = itemSold.get('D');
			if(CTotalItems<DTotalItems) {
				remainingPackets  = DTotalItems-CTotalItems;
				total = total + CTotalItems*30 + remainingPackets*itemListPrice.get('D');
			}
			else {
				remainingPackets = CTotalItems-DTotalItems;
				total = total + DTotalItems*30 + remainingPackets*itemListPrice.get('C');
			}
			
		}
		
		else {
			total = total + entry.getValue()*itemListPrice.get(entry.getKey());
		}
			
		
		
		
		}	
		
		return total;
			
	}

}
