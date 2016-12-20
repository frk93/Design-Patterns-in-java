/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statepattern;

/**
 *
 * @author Farrukh
 */
public class StatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       Context context = new Context();
       StartState startstate = new StartState();
       startstate.doAction(context);
       
       StopState stopstate = new StopState();
       stopstate.doAction(context);
       
       
    }
    
}
