package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProdcut extends Product {

	private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	private Date manufactureDate;

	public UsedProdcut(String name, Double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public String priceTag() {
		return super.getName() + " (used) $" + String.format("%.2f", super.getPrice()) + " (Manufacture date: "
				+ sdf.format(manufactureDate)
				+ ")";

	}

}
