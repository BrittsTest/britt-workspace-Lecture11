import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class NumberSetService {

    // Set<Integer> numbers = new HashSet<>();
    // Set<Integer> numbers2 = new HashSet<Integer>();
    // HashSet<Integer> numbers3 = new HashSet<>();

    //HashSet - backed by a HashMap, guarentees no ordering, allows a single null value
    //TreeSet - Does maintain order of elements (sorted) - 
    //  but if we use this insertion and removal of the elements is slower.
    //  because ordering must be upheld.
    Set<Integer> numbers;

    //Constructor
    public NumberSetService(){
        numbers = new HashSet<>();
    }

    //Add numbers to my Set
    public void addToNumbers(int num){
        numbers.add(num);
    }

    //check if an element exists in my Collection.
    public boolean checkNumber(int num){
        return numbers.contains(num);
    }

    public void removeNumber(int num){
        numbers.remove(num);
    }

    public void setMenu(Scanner sc){
        NumberSetService nService = new NumberSetService();
        while(true){
            System.out.println("add | check | remove | exit");
            System.out.println(nService.numbers);
            String choice = sc.nextLine();
            if(choice.equalsIgnoreCase("add")){
                nService.addToNumbers(Integer.parseInt(sc.nextLine()));
            }else if(choice.equalsIgnoreCase("check")){
                boolean exists = nService.checkNumber(Integer.parseInt(sc.nextLine()));
                if(exists){
                    System.out.println("This number exists in my Set!");
                }else{
                    System.out.println("Naw doesn't exists but you can add it!");
                }
            }else if(choice.equalsIgnoreCase("remove")){
                String input = sc.nextLine();
                int number = Integer.parseInt(input);
                nService.removeNumber(number);
            }else if(choice.equalsIgnoreCase("exit")){
                break;
            }
        }
    }

    
}
