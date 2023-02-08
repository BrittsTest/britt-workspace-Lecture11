import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import javafx.scene.effect.DisplacementMap;

public class DictionaryService {

    //Maps - deal with key value pairs and are not part of the Collections API
    // They are a data Structures and do not maintain order of insertion.
    // There are a variety of Maps
    /* - HashMap (class): Insertion and retrieval of elements by key is fast. 
        - Permits one null key
        - Allows null values. 

       - TreeMap (class): Insertion and retrieval of elements are slow
        - Cannot contain null keys
        - can contain null values. 
     Map(interface)
     * entrySet() - combines keys and values and put the combined value into a set to iterate over
     * values() - returns a collection of values that we can iterate through
     * keySet() - returns a Set of our keys
     */
     // Wrapper Class - converts primitives to objects. 
     //int - Integer
     //double - Double
     //char - Character
     //Autoboxing/unboxing - Java will generally automatically wrap a primitive into it's
     // Wrapper class or unwrap it when necessary
    
     Map<String, String> words;
    //   ^Key     ^Value

    public DictionaryService(){
        words = new HashMap<>();
    }

    public void addWordwithDefinition(String word, String definition){
        words.put(word, definition);
    }

    public String getDefinition(String word){
        return words.get(word);
    }

    public void mapMenu(Scanner sc){
        DictionaryService ds = new DictionaryService();
        while(true){
            System.out.println("put | get | exit");
            System.out.println(ds.words);
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("put")){
                String key = sc.nextLine();
                String value = sc.nextLine();
                ds.addWordwithDefinition(key, value);
            }else if(choice.equalsIgnoreCase("get")){
                String key = sc.nextLine();
                System.out.println(ds.getDefinition(key));
            }else if(choice.equalsIgnoreCase("exit")){
                break;
            }
        }
    }
}
