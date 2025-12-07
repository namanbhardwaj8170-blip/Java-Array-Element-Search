import java.util.*;
public class Arrays{
    public static void main(String args[]){
        //creating an array
        System.out.println("Enter size of your array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] numbers = new int[size];
        
        //input 
        System.out.println("Enter " + size + " element of your array: ");
        for(int i = 0; i<size; i++){
            numbers[i] = sc.nextInt();
        }
        
        System.out.println("Enter your target element: ");
        int x = sc.nextInt(); //Element that is to be searched
        //output
        
        for(int i = 0; i<numbers.length; i++){
            if(numbers[i]==x){
                System.out.println("Your element is found at index: " + i);
            }
        }
       
    }
}