
public class Caramel extends BeverageDecorator{
	public Caramel(Beverage beverage) {
		super(beverage);
	}
	
	@Override
	public String getDescription() {
		return BeverageDecorator.getDescription() + " extra Caramel";
	}
	
	public double getPrice() {
		return BeverageDecorator.getPrice() + 1.00;
	}

}
