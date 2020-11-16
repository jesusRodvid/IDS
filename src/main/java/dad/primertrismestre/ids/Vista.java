package dad.primertrismestre.ids;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;


public class Vista extends GridPane {

	Label usuarioLabel;
	Label passwdLabel;
	TextField usuarioTextfiel;
	PasswordField passwdTextfield;
	Button accederButton;
	Button cancelarButton;
	HBox hbox;
	Alert aciertoAlert;
	Alert falloAlert;

	public Vista() {
		usuarioLabel = new Label("Usuario:");
		usuarioTextfiel = new TextField();
		usuarioTextfiel.setPromptText("Usuario");

		passwdLabel = new Label("Contraseña:");
		passwdTextfield = new PasswordField();
		passwdTextfield.setPromptText("Contraseña");
		
		//Botonera
		accederButton = new Button("Acceder");
		cancelarButton = new Button("Cancelar");
		hbox = new HBox();
		hbox.getChildren().addAll(accederButton, cancelarButton);
		hbox.setSpacing(10);
		hbox.setAlignment(Pos.CENTER);
		hbox.setPadding(new Insets(5));
		
		//Login
		addRow(0, usuarioLabel, usuarioTextfiel);
		addRow(1, passwdLabel, passwdTextfield);
		addRow(2, hbox);
		
		// Los espacios chachis
		setPadding(new Insets(10));
		setHgap(25);
		setVgap(10);
		setAlignment(Pos.CENTER);
		GridPane.setColumnSpan(hbox, 2);
	}

	public void getAciertoAlert() {
		aciertoAlert = new Alert(AlertType.INFORMATION);
		aciertoAlert.setTitle("Iniciar sesión");
		aciertoAlert.setHeaderText("Acceso Permitido");
		aciertoAlert.setContentText("Las credenciales de acceso son válidas");
		aciertoAlert.showAndWait();
	}

	public void getFalloAlert() {
		falloAlert = new Alert(AlertType.WARNING);
		falloAlert.setTitle("Iniciar sesión");
		falloAlert.setHeaderText("Acceso denegado");
		falloAlert.setContentText("El usuario y/o la contraseña no son válidos");
		falloAlert.showAndWait();

	}
	public TextField getUsuarioText() {
		return usuarioTextfiel;
	}

	public PasswordField getPasswdText() {
		return passwdTextfield;
	}
	public Button getAccederButton() {
		return accederButton;
	}

	public Button getCancelarButton() {
		return cancelarButton;
	}
	
}