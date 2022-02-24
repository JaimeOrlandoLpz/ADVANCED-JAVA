/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package intro_to_generics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jaime Orlando López Ramos
 */
public class GenericMethods {

    static Character[] charArray = {'h', 'e', 'l', 'l', 'o'};
    static Integer[] intArray = {1, 2, 3, 4, 5};
    static Boolean[] boolArray = {true, false, true};
    
    public static <T> List<T> arrayToList(T[] array, List<T> list) {
        for (T t : array) {
            list.add(t);
        }
        return list;
    }
    
    public static <T> void printingAnyValue(T t){
        System.out.println(t);
    }
    

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        
        // Tests
        printingAnyValue(true);
        printingAnyValue(new Scanner(System.in));
        printingAnyValue(charList);
        printingAnyValue(intList);

    }


}
