package viewPackage;

import java.time.LocalDate;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

public class FindCustomerView 
{
	private FindCustomerController theController;
	public StackPane getSceneGUI()
	{
		theController=new FindCustomerController();
		
		StackPane root = new StackPane();
		root.setId("view_screen");
		
		VBox containerBox=new VBox();
		root.getChildren().add(containerBox);
		
		Button calculateAggrementButton = new Button("Beregn låneaftale");
		calculateAggrementButton.setId("view_button");
		calculateAggrementButton.setOnAction(new EventHandler<ActionEvent>() 
		{
		    @Override
		    public void handle(ActionEvent e) 
		    {
		    	theController.createLoanAggrementPressed();
		    }
		});
	
		containerBox.getChildren().add(calculateAggrementButton);
		
		return root;
	}
}
