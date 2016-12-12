/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorypattern;

/**
 *
 * @author Farrukh
 */
public class FactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AnimalFactory obj = new AnimalFactory();
        Animal animal = null;
        String speak = null;
        animal = obj.getAnimal("dog");
        speak = animal.speak();
        
        animal = obj.getAnimal("cat");
        speak = animal.speak();
        
        animal = obj.getAnimal("lion");
        speak = animal.speak();
    }
    
}
