

public class StarbuckCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	public StarbuckCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			super.save(customer);
		}else {
			System.out.println("Not a valid person");
		}
	}
}
