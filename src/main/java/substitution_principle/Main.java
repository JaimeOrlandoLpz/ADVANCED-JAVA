
package substitution_principle;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jaime Orlando
 */
public class Main {
    
    
    public static void main(String[] args) {
        Building building = new Building();        
        Office office = new Office();
        build(building);
        build(office); // It can receive an Office Object as an argument because Office is a subtype of building
        
//        List<Building> buildings = new ArrayList();
//        buildings.add(new Building());
//        buildings.add(new Office());
//        printBuildings(buildings);
        
//        List<Office> offices = new ArrayList();
//        offices.add(new Office());
//        offices.add(new Office());
//        printBuildings(offices);
        
    }
    
    // Method can receive a Building object and any of its subtypes
    static void build(Building building) {
        System.out.println("Constructing a new " + building.toString());
    }
    
    static void printBuildings(List<Building> buildings) {
        for(int i = 0; i < buildings.size(); i++) {
            System.out.println(i + 1 + ": " + buildings.get(i).toString());
        }
    }
    
}
