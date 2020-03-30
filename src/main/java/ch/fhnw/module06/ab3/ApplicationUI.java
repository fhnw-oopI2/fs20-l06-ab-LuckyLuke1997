package ch.fhnw.module06.ab3;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;

public class ApplicationUI extends BorderPane{
	
	private Button buttonTop;
	private Button buttonBottom;
	private Button buttonLeft;
	private Button buttonReight;
	private TextArea textArea;
	
	public ApplicationUI() {
		initializeControls();
		layoutControls();
	}
	
	private void initializeControls() {
		buttonTop = new Button("Top");
		buttonBottom = new Button("Bottom");
		buttonLeft = new Button("Left");
		buttonReight = new Button("Right");
		textArea = new TextArea("Text_Area");
	}
	
	private void layoutControls() {
		this.setPadding(new Insets(5));

		this.setTop(buttonTop);
		buttonTop.setMaxWidth(2000);
		
		this.setBottom(buttonBottom);
		buttonBottom.setMaxWidth(2000);
		
		this.setLeft(buttonLeft); 
		ApplicationUI.setMargin(buttonLeft, new Insets(5,0,0,0));
		
		this.setRight(buttonReight); 
		ApplicationUI.setMargin(buttonReight, new Insets(5,0,0,0));
		
		this.setCenter(textArea); 
		ApplicationUI.setMargin(textArea, new Insets(5,5,5,5));
		
	}
}
