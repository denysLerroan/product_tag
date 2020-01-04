package entities;

public class ImportedProduct extends Product {

	private Double customsFee;

	public ImportedProduct() {
	}

	public ImportedProduct(String name, Double price, Double customsFee) {
		super(name, price);
		this.customsFee = customsFee;
	}

	public Double getCustumsFee() {
		return customsFee;
	}

	public void setCustumsFee(Double custumsFee) {
		this.customsFee = custumsFee;
	}

	public double totalPrice() {
		return super.getPrice() + customsFee;

	}

	public final String priceTag() {
		return super.getName() + " $" + String.format("%.2f", totalPrice()) + " (Customs fee: $ "
				+ String.format("%.2f", customsFee)
				+ ")";
	}
}
