package dad.primertrismestre.ids;

import java.io.IOException;

import javafx.application.Platform;
import javafx.event.ActionEvent;

public class Controller {
	
	Vista vista = new Vista();
	Modelo modelo = new Modelo();
	public Controller() {
		vista.getAccederButton().setOnAction(e -> onAccederButtonAction(e));
		vista.getCancelarButton().setOnAction(e -> onCancelarButtonAction(e));	
		modelo.loadCSV();
	}
	public Vista getView() {
		return vista;
	}
	public Modelo getModel() {
		return modelo;
	}

	private void onAccederButtonAction (ActionEvent e){

		modelo.userProperty().set(vista.getUsuarioText().textProperty().getValue());
		modelo.psswdProperty().set(vista.getPasswdText().textProperty().getValue());
		
		modelo.setMd5();
		
		try {
			if (modelo.checkMd5())
				vista.getAciertoAlert();
			else
				vista.getFalloAlert();
		} catch (IOException ex) {
			vista.getFalloAlert();
		}
			
	}
	
	private void onCancelarButtonAction (ActionEvent e){
		Platform.exit();
	}

}

