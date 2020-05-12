/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeichnenprogramm;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;

/**
 *
 * @author lud.korn
 */
public class FXMLDocumentController implements Initializable {

    
    private Draw draw;
    
    @FXML
    private Button button;
    @FXML
    private Pane pane;
    
    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        draw = new Draw(pane);
    }    

    @FXML
    private void onMouseReleased(MouseEvent event) {
        draw.onMouseReleased(event);
    }

    @FXML
    private void onMouseDragged(MouseEvent event) {
        draw.onMouseDragged(event);
    }

    @FXML
    private void onMousePressed(MouseEvent event) {
        draw.onMousePressed(event);
    }

    @FXML
    private void onMouseMoved(MouseEvent event) {
        draw.onMouseMoved(event);
    }
    
}
