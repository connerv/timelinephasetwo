package gui;

import java.io.IOException;
import model.TimelineMaker;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;

/**
 *
 * @author Brian
 */
public class Driver extends Application {

    TimelineMaker timelineMaker;

    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {
        TimelineMaker timelineMaker = new TimelineMaker();
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("MainWindow.fxml"));
            Parent root = (Parent) loader.load();
            MainWindowController controller = loader.<MainWindowController>getController();
            controller.initData(timelineMaker);
            primaryStage.setTitle("I can't think of a catchy title");
            Scene scene = new Scene(root);
            scene.getStylesheets().add("gui/MainWindow.css");
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }
}
