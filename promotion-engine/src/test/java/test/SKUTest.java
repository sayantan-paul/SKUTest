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
	
	@Test
	public void testABC111() {
		promotionEngineItemList.addNewItem('A', 50.00);
		promotionEngineItemList.addNewItem('B',30.00);
		promotionEngineItemList.addNewItem('C', 20.00);
		promotionEngineService.addNoOfItem('A', 1);
		promotionEngineService.addNoOfItem('B', 1);
		promotionEngineService.addNoOfItem('C', 1);
		assertEquals(100.00,promotionEngineService.calculateTotal(),0.00);
	}
	
	@Test
	public void testABC551() {
	promotionEngineItemList.addNewItem('A', 50.00);
	promotionEngineItemList.addNewItem('B',30.00);
	promotionEngineItemList.addNewItem('C', 20.00);
	promotionEngineService.addNoOfItem('A', 5);
	promotionEngineService.addNoOfItem('B', 5);
	promotionEngineService.addNoOfItem('C', 1);
	assertEquals(370.00,promotionEngineService.calculateTotal(),0.00);
}
	
	@Test
	public void testABCD3511() {
	promotionEngineItemList.addNewItem('A', 50.00);
	promotionEngineItemList.addNewItem('B',30.00);
	promotionEngineItemList.addNewItem('C', 20.00);
	promotionEngineItemList.addNewItem('D', 15.00);
	promotionEngineService.addNoOfItem('A', 3);
	promotionEngineService.addNoOfItem('B', 5);
	promotionEngineService.addNoOfItem('C', 1);
	promotionEngineService.addNoOfItem('D', 1);
	assertEquals(165.00,promotionEngineService.calculateTotal(),0.00);
}

}
