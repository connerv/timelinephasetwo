package gui;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
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

//Timeline Properties Controller
public class TimelinePropertySceneController implements Initializable {

	@FXML
	public Button color;
	public Button ok;
        public Button cancel;
	public TextField title;
	public TextField font;
        
        public ObservableList<String> axisList = FXCollections.observableArrayList("Days", "Weeks", "Months", "Years", "Decades", "Centuries", "Millenia");
        public ComboBox axisLabelBoxed = new ComboBox(axisList);
        
        public javafx.scene.paint.Color colorChoice;
               
	@FXML
	public void handleButtonActionOK(ActionEvent event) throws Exception {
            //Get color from ColorChooser
            //Send it out
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
