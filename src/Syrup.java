public class Syrup extends BeverageDecorator{
	public Syrup(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return BeverageDecorator.getDescription() + " extra Syrup";
	}
	
	public double getPrice() {
		return BeverageDecorator.getPrice() + 3.00;
	}

}