package viewPackage;

import logic.CustomerDataModel;
import logic.LoanHandler;

public class FindCustomerController 
{
	public void createLoanAggrementPressed()
	{
		//TODO
		//simulate customer for now
		CustomerDataModel customer=new CustomerDataModel("Jens Lyn", "langeløgallé 53", "Lem", "4343", "45232343", "Sutmin@hotmail.com", "0102033434");
		
		//setup loanaggrementcalled
		LoanHandler loanHandler=new LoanHandler();
		loanHandler.setupLoanAgreement(customer);
		//create loanaggrementview 
		CreateLoanAggrementController controller = new CreateLoanAggrementController(loanHandler, customer);
		
		MainScreenController.INSTANCE.changeScene(controller.getView().getSceneGUI());
		
	}
}