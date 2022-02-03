package linkedinlearning.cucumbercourse;

public class RestaurantMenuItem {

	private String ItemName;
	private String Description;
	private int Price;
	
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public int getPrice() {
		return Price;
	}
	public void setPrice(int price) {
		Price = price;
	}
	public String getItemName() {
		return ItemName;
	}
	
	public RestaurantMenuItem(String itemName, String description, int price) {
		super();
		ItemName = itemName;
		Description = description;
		Price = price;
	}
	
}
