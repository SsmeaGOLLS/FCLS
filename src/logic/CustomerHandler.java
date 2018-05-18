package logic;

import java.util.ArrayList;
import java.util.List;

import database.CustomerDAO;

public class CustomerHandler {

	private List<CustomerDataModel> customers;
	private CustomerDAO customerDAO;
	
	public CustomerHandler()
	{
		customerDAO = new CustomerDAO();
	}
	
	public boolean insertToDB(CustomerDataModel customer) {
		return customerDAO.createNewCustomer(customer);	
	}
	
	public List<CustomerDataModel> getCustomers(String firstName, String lastName, String phoneNumber)
	{
		if(customers==null)
			customers = customerDAO.getCustomerList();
		
		List<CustomerDataModel> customers = new ArrayList<CustomerDataModel>();
		
		for(CustomerDataModel cdm : this.customers)
		{
			if( !considerProperty(cdm.getCustomerFirstName(),firstName) ||
				!considerProperty(cdm.getCustomerLastName(),lastName) ||
				!considerProperty(cdm.getCustomerPhone(),phoneNumber) )
				continue;
			
			customers.add(cdm);
		}
		
		return customers;
	}
	
	private boolean considerProperty(String customerProperty, String otherProperty)
	{
		if(otherProperty!=null && otherProperty.length()>0)
			if(customerProperty!= null && !customerProperty.toLowerCase().contains(otherProperty.toLowerCase()) )
				return false;
		return true;
	}
}