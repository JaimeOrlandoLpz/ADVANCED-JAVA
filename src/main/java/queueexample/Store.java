/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.ArrayList;

// We'll simulate a queue's behaviour using a LinkedList
import java.util.LinkedList;

/**
 *
 * @author Jaime Orlando
 */
public class Store {
    
    public static void main(String[] args) {                
        
        LinkedList<Customer> queue = new LinkedList();
        queue.add(new Customer("Kitty"));
        queue.add(new Customer("Kendall"));
        queue.add(new Customer("Orion"));
        queue.add(new Customer("Luquisha"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println("\nRemaining Customers: ");
        System.out.println(queue);
        
       
    }
    
    static void serveCustomer(LinkedList<Customer> queue){
        // The poll() method from a LinkedList retrieves the firt element from the List and removes it from the List
        Customer c = queue.poll();
        c.serve();
    }
    
    
}
