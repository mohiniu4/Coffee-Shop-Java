
public class Cappuccino extends Beverage{

	public Cappuccino () {
		this.description = "Cappuccino";
	}
	
	@Override
	public double getPrice() {
		return 5.00;
	}
	
	@Override
	public String getDescription()
	{
		return this.description;
	}
	

}
