package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Ventana1Controller {

	@FXML
	private void onButtonAbrirClicked(ActionEvent event) {
		try {
			Stage stage = new Stage();
			FXMLLoader loader = new FXMLLoader(getClass().getResource("Ventana2.fxml"));
			BorderPane root = (BorderPane) loader.load();
			Scene scene = new Scene(root,450,410);
			stage.setScene(scene);
			// Oculta los botones de cerrar/minimizar/maximizar
			stage.initStyle(StageStyle.UNDECORATED);
			stage.show();

			Ventana2Controller controller = loader.getController();
			controller.mandarInfoDesdeVentana1("BLABLALBALBLABLALBAB");
			controller.setVentana1(this);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

	public void recibirInformacion(String info){
		System.out.println("Informacion recibida en ventana 1 de la ventana 2 = " + info);
	}
}