package view;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.image.Image;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		
		try {
			primaryStage.setResizable(false);
			primaryStage.setScene(FCLSController.INSTANCE.getFCLS().createMainScreenScene());
			setupStage(primaryStage);
			primaryStage.show();
			
			FCLSController.INSTANCE.startLoginScreen();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
	
	public void setupStage(Stage primaryStage)
	{
		primaryStage.setTitle("FCLS");
		Image image= new Image(getClass().getResourceAsStream("ferrariLogo.png"));
		primaryStage.getIcons().add(image);
	}
}
