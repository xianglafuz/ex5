/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyex;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

/**
 *
 * @author 01111
 */
public class Listener2 implements PropertyChangeListener{

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        System.out.println("live result: "+evt.getNewValue()); //To change body of generated methods, choose Tools | Templates.
    }
    
}
