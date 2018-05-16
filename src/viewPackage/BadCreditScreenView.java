package viewPackage;


import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

//
//TODO Remove this. Replace this with Alert.
//

public class BadCreditScreenView 
{
	private BadCreditScreenController theController;
	
	public Scene createLoginScene(BadCreditScreenController controller)
	{
		theController=controller;
		StackPane root = new StackPane();
		root.setId("view_screen");
		
		VBox container=new VBox();
		root.getChildren().add(container);
		container.setAlignment(Pos.CENTER);
		container.setPadding(new Insets(25, 25, 25, 25));
	
		Label warningLabel = new Label("Kunde er registreret som dårlig betaler, lånetilbud er afvist");
		container.getChildren().add(warningLabel);

		Button acceptButton = new Button("Acceptér");
		acceptButton.setId("view_button");
		acceptButton.setOnAction(new EventHandler<ActionEvent>() {
			 
		    @Override
		    public void handle(ActionEvent e) 
		    {
		    	theController.warningAccepted();
		    }
		});
		
		
		container.getChildren().add(acceptButton);
		container.setMargin(acceptButton, new Insets(12, 0, 0, 0));
		
		Scene scene= new Scene(root, 400, 200);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		
		return scene;
	}
}