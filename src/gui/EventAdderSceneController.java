package gui;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import model.TLEvent;
import model.Atomic;
import model.Duration;
import java.net.URL;
import java.sql.Date;
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

//Event Adder Controller
public class EventAdderSceneController implements Initializable {

	@FXML

	public TextField inputFileName;
	public TextField title;
        public TextField startDate;
        public TextField endDate;
        public TextField category;
        public TextArea comments;
        public Button ok;
        public Button cancel;
               
        private ObservableList<String> eventTypeList = FXCollections.observableArrayList("Atomic", "Duration");
        public ComboBox eventType = new ComboBox(eventTypeList);
        
	@FXML
	public void handleButtonActionOK(ActionEvent event) throws Exception {
                TLEvent newEvent;
                String titleName = title.toString();
                String eventCategory = category.toString();
                String dateString = startDate.toString();
                if (eventType.equals("Atomic")) newEvent = new Atomic(titleName, eventCategory, Date.valueOf(dateString));
                else
                {
                    String endDateString = endDate.toString();
                    newEvent = new Duration(titleName, eventCategory, Date.valueOf(dateString), Date.valueOf(endDateString));
                }
                    //send out event
                      dispose();
	}

	@FXML
	public void handleButtonActionCancel(ActionEvent event) throws Exception {
               dispose();
	}

	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}    
}
