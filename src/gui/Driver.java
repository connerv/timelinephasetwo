package gui;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.*;

/**
 * Driver.java
 * 
 * This class starts the application.
 * 
 * @author Andrew Thompson and Josh Wright
 * Wheaton College, CS 335, Spring 2014
 * Project Phase 1
 * Feb 15, 2014
 *
 */
public class Driver extends Application{
    
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));  
        stage.setTitle("Timelord");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
	public static void main(String[] args) {
		launch(args);
	}
}
