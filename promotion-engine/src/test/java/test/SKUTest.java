package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import sourceCode.PromotionEngineItemList;
import sourceCode.PromotionEngineService;

public class SKUTest {
	
	PromotionEngineItemList promotionEngineItemList = new PromotionEngineItemList();
	PromotionEngineService promotionEngineService = new PromotionEngineService();
	

	@Test
	public void testA5items() {
		
		promotionEngineItemList.addNewItem('A', 50.00);
		promotionEngineService.addNoOfItem('A', 5);		
		assertEquals(230.00, promotionEngineService.calculateTotal(), 0.00);
		
		
		
		
	}

}
