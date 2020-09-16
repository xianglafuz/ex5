/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyex;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author 01111
 */
public class MyPropertyBean implements Serializable {
    
    public static final String SCORE_PROPERTY = "score";
    
    private String score;
    
    private PropertyChangeSupport propertySupport;
    
    public MyPropertyBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getScore() {
        return score;
    }
    
    public void setScore(String score) {
        String oldScore = this.score;
        this.score = score;
        propertySupport.firePropertyChange(SCORE_PROPERTY, oldScore, this.score);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
