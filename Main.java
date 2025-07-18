import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Example usage of the method
     
        //System.out.println( "Hello, World!");  // Output: !dlroW ,olleH
        int a=10;
        float b=20.5f;
        double c=30.75;
        String str= "Hello, World!";
        List<Integer> list = new ArrayList<>();
        System.out.println(str); 
        System.out.println(a); 
        System.out.println(b);
        System.out.println(c);
        System.out.println(list); // Output: !dlroW ,olleH
        Human human = new Human("Alice", 30);
        System.out.println(human); // Output: Human{name='Alice', age=30}

    }
    
}
