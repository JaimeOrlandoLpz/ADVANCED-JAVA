/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */

package intro_to_generics;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaime Orlando López Ramos
 */
public class GenericsExample {
    
    public static void main(String[] args) {
        
        // Example without Generics
        List names = new ArrayList();
        names.add("Kelly");        
        String name = (String) names.get(0); 
        System.out.println("First name: " + name);
        //names.add(7);
        
        
        // Example with Generics
        List<String> names2 = new ArrayList(); // This makes the compiler check that only Strings are accepted in the collection
        names2.add("Kelly");        
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
        //names2.add(7);
        
        List<Integer> numbers = new ArrayList();
        numbers.add(3);
        numbers.add(87);
        for(Integer i : numbers){
            System.out.println(i);
        }
        
    }
    
}
