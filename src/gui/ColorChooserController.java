package gui;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

/**
 *
 * @author Brian
 */

//Color Chooser Controller (Not yet functional in main program)
public class ColorChooserController implements Initializable {

	@FXML
	public Button select;
	public Button done;
        public ColorPicker colorPicker;

        public javafx.scene.paint.Color colorChoice;
        
	@FXML
	public javafx.scene.paint.Color handleButtonActionSelect(ActionEvent event) throws Exception {
                return colorChoice = colorPicker.getValue();
	}

	@FXML
	public void handleButtonActionDone(ActionEvent event) throws Exception {
               dispose();
	}
        
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		// TODO
	}    
}
