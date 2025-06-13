public class Milk extends BeverageDecorator{
	public Milk(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return BeverageDecorator.getDescription() + " extra Milk";
	}
	
	public double getPrice() {
		return BeverageDecorator.getPrice() + 2.00;
	}

}