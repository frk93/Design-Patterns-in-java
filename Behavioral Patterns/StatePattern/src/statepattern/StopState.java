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
public class StopState  implements State {
    
     public void doAction(Context context)
    {
        System.out.println("In stop state");
        context.setState(this);
    }
    
}
