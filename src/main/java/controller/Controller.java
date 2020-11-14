package controller;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

public class Controller {
	
	 @FXML
	    private ResourceBundle resources;

		@FXML
	    private URL location;
	    
	    @FXML
	    private VBox vbox;


	    @FXML
	    private Label labelusuario;

	    @FXML
	    private TextField textusuario;

	    @FXML
	    private PasswordField textpassword;

	    @FXML
	    private Label labelpasswd;

	    @FXML
	    private Button buttomok;

	    @FXML
	    private Button buttomcancel;

	    @FXML
	    public void initialize() {
	    	FXMLLoader loader = new FXMLLoader();
	    	loader.setLocation(getClass().getResource("fxmlvista.fxml"));
	    	resources=loader.getResources();
	        assert vbox != null : "fx:id=\"vbox\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert labelusuario != null : "fx:id=\"labelusuario\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert textusuario != null : "fx:id=\"textusuario\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert textpassword != null : "fx:id=\"textpassword\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert labelpasswd != null : "fx:id=\"labelpasswd\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert buttomok != null : "fx:id=\"buttomok\" was not injected: check your FXML file 'fxmlvista.fxml'.";
	        assert buttomcancel != null : "fx:id=\"buttomcancel\" was not injected: check your FXML file 'fxmlvista.fxml'.";

	    }

	    public VBox getVbox() {
		return vbox;
	}

	public void setVbox(VBox vbox) {
		this.vbox = vbox;
	}
	

}
