package application;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.*;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Dialog_controller {
	@FXML
	public Label dialog_lbl;
	public void OKButtonPressed(ActionEvent e) {
		Node source=(Node)e.getSource();
		Stage stage=(Stage)source.getScene().getWindow();
		stage.close();
		
	}
	public void setDialogText(String s) {
		dialog_lbl.setText(s);
	}
	

}
