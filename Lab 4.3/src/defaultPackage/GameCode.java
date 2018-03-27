package defaultPackage;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class GameCode extends Application
{
	@Override
	public void start(Stage primaryStage) 
	{
		//Red Button
		 primaryStage.setTitle("Red");
	        Button btn = new Button();
	        btn.setText("Say 'Red'");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Red");
	            }
	        });
	        
	        StackPane root = new StackPane();
	        root.getChildren().add(btn);
	        primaryStage.setScene(new Scene(root, 300, 250));
	        primaryStage.show();
	   	 //Blue Button
	      primaryStage.setTitle("Blue");
	        Button btn1 = new Button();
	        btn.setText("Say 'Blue'");
	        btn.setOnAction(new EventHandler<ActionEvent>() {
	 
	            @Override
	            public void handle(ActionEvent event) {
	                System.out.println("Blue");
	            }
	        });
	        
	        StackPane root1 = new StackPane();
	        root1.getChildren().add(btn1);
	        primaryStage.setScene(new Scene(root1, 300, 250));
	        primaryStage.show();
	}

}
