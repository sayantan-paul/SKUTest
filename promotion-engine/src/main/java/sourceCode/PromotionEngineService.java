package sourceCode;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngineService {
	
	PromotionEngineDiscountCalculator promotionEngineDiscountCalculator  = new PromotionEngineDiscountCalculator();
	
	Map<Character,Integer> itemCount = new HashMap<Character,Integer>();

	public void addNoOfItem(Character itemName, Integer count) {
		System.out.println("item added in promotion service");
		itemCount.put(itemName, count);
		
	}
	
	public double calculateTotal() {
		System.out.println("Returning discount");
		return promotionEngineDiscountCalculator.calculateDiscount(itemCount);
	}



}

