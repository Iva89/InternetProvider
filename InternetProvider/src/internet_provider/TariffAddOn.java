package internet_provider;

public class TariffAddOn {

	private double addOnsprice;
	private AddOnsType type;

	public TariffAddOn(double addOnsprice, AddOnsType type) {
		this.addOnsprice = addOnsprice;
		this.type = type;
	}

	public double getAddOnsprice() {
		return addOnsprice;
	}

	public AddOnsType getType() {
		return type;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(AddOnsType type : AddOnsType.values()) {
			sb.append(type.toString());
			sb.append("\n");
		}
		return sb.toString();
	}
	
}
