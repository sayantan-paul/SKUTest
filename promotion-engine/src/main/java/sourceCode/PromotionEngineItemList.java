package sourceCode;

import java.util.HashMap;
import java.util.Map;

public class PromotionEngineItemList {

	static Map<Character, Double> itemList = new HashMap<Character, Double>();

	public void addNewItem(Character itemName, Double unitPrice) {
		if (itemList.containsKey(itemName)) {
			System.out.println("Item already exists");
		} else {
			itemList.put(itemName, unitPrice);
			System.out.println("Item " + itemName + " added Successfully with price = " + unitPrice);

		}

	}

	public void modifyItemPrice(Character itemName, Double unitPrice) {
		if (itemList.containsKey(itemName)) {
			Double oldUnitPrice = itemList.get(itemName);
			itemList.replace(itemName, oldUnitPrice, unitPrice);
			System.out.println("Item " + itemName + " succesfully modified with price = " + unitPrice);
		} else {
			System.out.println("Item doesnot exist");

		}

	}

	public void removeItem(Character itemName) {
		if (itemList.containsKey(itemName)) {
			itemList.remove(itemName);
			System.out.println("Item " + itemName + " succesfully removed");
		} else {
			System.out.println("Item doesnot exist");

		}

	}

	public static Map<Character, Double> getItemList() {
		return itemList;
	}

}
