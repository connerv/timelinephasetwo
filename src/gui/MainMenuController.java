package gui;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Brian
 */

//Main Menu Controller
public class MainMenuController implements Initializable {

	@FXML
	public Button addEvent;
	public Button deleteEvent;
	public Button editEvent;
        public Button newTimeline;
	public Button deleteTimeline;
        public Button editTimeline;
        
        public MenuItem newTimelineMenu;
        public MenuItem saveTimelineMenu;
        public MenuItem exit;
        public MenuItem undo;
        public MenuItem redo;
        public MenuItem editView;
        public MenuItem multiView;
        public MenuItem newEvent;
               
        public ObservableList<String> timelineList = FXCollections.observableArrayList("None Yet!");
        public ComboBox timelineListBoxed = new ComboBox(timelineList);
        
	@FXML
	public void handleButtonActionNewTimeline(ActionEvent event) {
            //Open Timeline Properties Window
            if(timelineList.contains("None Yet!")) timelineList.remove("None Yet!");
        }
        
        @FXML
        public void handleButtonActionEditTimeline(ActionEvent event) {
            //Open Timeline Properties Window
        }

	@FXML
	public void handleButtonActionViewTimeline(ActionEvent event) {
            //Open Timeline Properties Window
	}

	@FXML
	public void handleButtonActionQuit(ActionEvent event) {
		System.exit(0);
	}
        
        @FXML
        public void handleButtonActionAddEvent(ActionEvent event) {
            //Open Event Window
        }
        
        @FXML
        public void handleButtonActionDeleteEvent(ActionEvent event) {
            //Open Event Window
        }
        
        @FXML
        public void handleButtonActionEditEvent(ActionEvent event) {
            //Open Event Window
        }

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}    
}
