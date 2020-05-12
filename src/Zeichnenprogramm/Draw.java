/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeichnenprogramm;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;

/**
 *
 * @author lud.korn
 */
public class Draw {
    
    private Pane pane;

    public Draw(Pane pane) {    
        this.pane = pane;
    }
    
    
    
    
     public void onMouseReleased(MouseEvent event) {
        System.out.println("released");
    }

    public void onMouseDragged(MouseEvent event) {
        System.out.println("dragged");
        drawPoint(event.getX(), event.getY());
    }

    public void onMousePressed(MouseEvent event) {
        System.out.println("pressed");
        drawPoint(event.getX(), event.getY());
    }

    public void onMouseMoved(MouseEvent event) {
        System.out.println("moved");
    }
 
    
    private void drawPoint(double x, double y){
        Circle circle = new Circle(x,y,5, Paint.valueOf("blue"));
        pane.getChildren().add(circle);
        
        
    }
    
}
