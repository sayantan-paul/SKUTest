package sourceCode;

public class PromotionEngineDetails {
	
	Character itemName;
	Integer unitPrice;
	Integer discount_calculator;
	
	public Character getItemName() {
		return itemName;
	}
	public void setItemName(Character itemName) {
		this.itemName = itemName;
	}
	public Integer getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}
	public Integer getDiscount_calculator() {
		return discount_calculator;
	}
	public void setDiscount_calculator(Integer discount_calculator) {
		this.discount_calculator = discount_calculator;
	}
	@Override
	public String toString() {
		return "PromotionEngine [itemName=" + itemName + ", unitPrice=" + unitPrice + ", discount_calculator="
				+ discount_calculator + "]";
	}
	
	

}
