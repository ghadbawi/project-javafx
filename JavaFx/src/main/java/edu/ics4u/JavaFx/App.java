package edu.ics4u.JavaFx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class App extends Application {
	
	@Override
	public void start(Stage stage) 
	{
		var label = new Label("click for money");
		var button = new Button("click");
		
		var root = new VBox(label, button);
		
		var scene = new Scene(root, 400, 300);
		stage.setScene(scene);
		stage.show();
	}
	
	public static void main(String[] args) {
		Launch();
	}

	private static void Launch() {
		// TODO Auto-generated method stub
		
	}

}