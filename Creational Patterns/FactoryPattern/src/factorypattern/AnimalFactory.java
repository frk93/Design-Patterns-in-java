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
public class AnimalFactory {
    
    public Animal getAnimal(String animalType)
   {
       Animal animal = null ;
       if(animalType.equalsIgnoreCase("dog"))
       {
           animal = new Dog();
       }
       else if(animalType.equalsIgnoreCase("cat"))

       {
           animal = new Cat();
       }
       else if(animalType.equalsIgnoreCase("lion"))
       {
           animal = new Lion();
       }
       
       return animal;      
      
   }
    
}
