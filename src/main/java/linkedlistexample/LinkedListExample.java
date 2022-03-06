 
package linkedlistexample;

import java.util.LinkedList;

/**
 *
 * @author Jaime Orlando
 */
public class LinkedListExample {
    
    
    public static void main(String[] args) {
        LinkedList<Character> charList = new LinkedList();
        for(int i = 0; i < 10; i++){
            // Add chars from 0 to 9
            charList.add((char)('a' + i));
        }
        
        // Testing iterability
        for(Character ch : charList){
            System.out.println(ch + " It's Mo Stunning");
        }
        
        // Adding a blank line
        System.out.print('\n');
        
        // Iterating using an index
        for(int i = 0; i < charList.size(); i++){
            System.out.println(charList.get(i)+ " Now let's make it shake Hunny");
        }
    }

    
}
