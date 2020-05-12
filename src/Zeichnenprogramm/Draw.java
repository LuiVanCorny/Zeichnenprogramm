/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Zeichnenprogramm;

import javafx.scene.input.MouseEvent;

/**
 *
 * @author lud.korn
 */
public class Draw {
    
     public void onMouseReleased(MouseEvent event) {
        System.out.println("released");
    }

    public void onMouseDragged(MouseEvent event) {
        System.out.println("dragged");
    }

    public void onMousePressed(MouseEvent event) {
        System.out.println("pressed");
    }

    public void onMouseMoved(MouseEvent event) {
        System.out.println("x: " + event.getX() + "\ty: " + event.getY());
    }
    
}
