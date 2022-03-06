
package hashmapexample;

import java.util.HashMap;

/**
 *
 * @author Jaime Orlando
 */
public class HashMapExample {
    
    public static void main(String[] args) {  
        
        HashMap<String, Double> grades = new HashMap();
        grades.put("Ra'Jah", 97.8);
        grades.put("Aja", 100.0);
        grades.put("Tamisha", 69.5);
        
        double ajaGrade = grades.get("Aja");
        System.out.println(ajaGrade);
    }
    
}
