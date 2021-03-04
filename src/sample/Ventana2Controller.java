package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Ventana2Controller {

	private Ventana1Controller ventana1Controller;   //Inicialización del controlador

	@FXML
	private Button buttonCerrarVentana;

	
	@FXML
	private void onButtonCerrarVentanaClicked(ActionEvent event) {
	    Stage stage = (Stage) buttonCerrarVentana.getScene().getWindow();
	    stage.close();
	}
	
	@FXML
	private void onButtonCerrarAppClicked(ActionEvent event) {
	    System.exit(0);
	}

	public void mandarInfoDesdeVentana1(String info){
		System.out.println("Información enviada: " + info);
	}

	public void setVentana1(Ventana1Controller ventana1){  //Pasas la información a Controller1  Ventana1Controller
		ventana1Controller = ventana1;
		ventana1Controller.recibirInformacion("JAJAJAJJAJA");
	}
	
}
