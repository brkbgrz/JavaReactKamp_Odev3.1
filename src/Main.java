import java.util.Date;

public class Main {

	public static void main(String[] args) {
		BaseCustomerManager customerManager = new StarbuckCustomerManager(new MernisServiceAdapter());
		@SuppressWarnings("deprecation")
		Customer customer = new Customer(1, "Berke", "Bağıröz",new Date(1996,9,14),11111111111L);
		customerManager.save(customer);

	}

}
