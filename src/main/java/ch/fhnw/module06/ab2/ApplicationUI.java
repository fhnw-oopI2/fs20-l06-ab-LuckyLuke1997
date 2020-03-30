package ch.fhnw.module06.ab2;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class ApplicationUI extends VBox{
	
	private Button button;
	private Label label;
	private TextField textField;
	private TextArea textArea;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		button = new Button("ein Button");
		label = new Label("ein Labael");
		textField = new TextField("text field");
		textArea = new TextArea("text area");
	}
	
	private void layoutControls() {
		this.setPadding(new Insets(10));
		
		ApplicationUI.setMargin(button, new Insets(5,0,0,0));

		this.getChildren().add(label);
		this.getChildren().add(textField);
		this.getChildren().add(textArea);
		this.getChildren().add(button);
	}
}
