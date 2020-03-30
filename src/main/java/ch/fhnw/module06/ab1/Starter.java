package ch.fhnw.module06.ab1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Starter extends Application {

	public static void main(String[] args) {
		Application.launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Scene scene = new Scene(new ApplicationUI());
		primaryStage.setTitle("Hello Title");
		primaryStage.setScene(scene);
		primaryStage.setWidth(400);
		primaryStage.setHeight(300);
		primaryStage.show();
	}
}

//First Example:
//
//@Override
//public void start(Stage primaryStage) throws Exception {
//    Button button = new Button("Hello World");
//	  Parent rootPane = new ApplicationUI();
//    Scene myScene = new Scene(rootPane);
//
//    StackPane rootPane = new StackPane();
//    rootPane.getChildren().add(button);
//
//    Scene myScene = new Scene(rootPane);
//    primaryStage.setTitle("JavaFX App");
//    primaryStage.setScene(myScene);
//    primaryStage.setWidth(400);
//    primaryStage.setHeight(300);
//    primaryStage.show();
//	
//}