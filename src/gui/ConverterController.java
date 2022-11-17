package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import util.Alerts;

public class ConverterController {

	@FXML
	private TextField temperature;
	@FXML
	private Label res;
	@FXML
	private RadioButton ce, fa;
	
	
	public void converterFa() {
		
		try {
			double temp = Double.parseDouble(temperature.getText());
			temp = temp*1.8 + 32;
			
			res.setText(String.format("%.2f", temp));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Um numero Invalido foi informado!!", e.getMessage(), AlertType.ERROR);
		}
		
		
	}
	public void converterCe() {
		try {
			double temp = Double.parseDouble(temperature.getText());
			temp = (temp - 32) /1.8;
			
			res.setText(String.format("%.2f", temp));
		} catch (NumberFormatException e) {
			Alerts.showAlert("Error", "Um numero Invalido foi informado!!", e.getMessage(), AlertType.ERROR);
		}		
		
	}	
	
}
