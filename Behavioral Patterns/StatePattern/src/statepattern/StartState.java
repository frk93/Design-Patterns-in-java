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
public class StartState implements State{
    
    public void doAction(Context context)
    {
        System.out.println("In start state");
        context.setState(this);
    }
            
    
}
