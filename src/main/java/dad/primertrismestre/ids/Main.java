package dad.primertrismestre.ids;
import controller.Controller;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
public class Main extends Application{
	  
	private static Controller c1;
	
	public Main() {
		c1 = new Controller();
		c1.initialize();
	}
	
	public void start(Stage stage) throws Exception {       
		 Parent root = FXMLLoader.load(getClass().getResource("fxmlvista.fxml"));
	        Scene sc = new Scene(root);
	        stage.setScene(sc);
	        stage.show();
	    

	   }
	public static void main(String[] args){
		// TODO Auto-generated method stub
		launch(args);
	}
	   
}
