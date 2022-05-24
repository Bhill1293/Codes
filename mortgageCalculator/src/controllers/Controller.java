package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;

import java.awt.event.ActionEvent;

public class Controller {
    FXMLLoader fxmlLoader = new FXMLLoader();//creating FXMLLoader object
//    fxmlLoader.setLocation(new URL("com.company/sample.fxml"));//accessing FXML file

    private float interest;
    private int principal;
    private byte period;




    @FXML
    public void operateButton (ActionEvent click) {
     Button button = (Button)click.getSource();

    }


}
