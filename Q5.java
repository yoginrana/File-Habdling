import java.util.Scanner;  
import java.io.IOException;  
import java.io.FileReader;  
import java.io.BufferedReader;  
public class Q5 {  
 public static void main(String[] args) throws IOException{  
    Scanner input = new Scanner(System.in);  
    System.out.println("1. Search for a term");  
    System.out.println("2. Search for a keyword in the descriptions");  
    System.out.println("3. End");  
    System.out.println("Key in choice");  
    int option = input.nextInt();  
    if (option == 1){  
      System.out.println("Enter term to search by");  
      input.nextLine();  
      String searchItem = input.nextLine();  
      Word(searchItem);  
    } else if (option == 2){  
      System.out.println("Enter a word in the discription");  
      input.nextLine();  
      String searchItem = input.nextLine();  
      Description(searchItem);  
    } else{  
       System.out.println("Exit Program");  
    }  
 }  
 public static void Word(String searchItem) throws IOException {  
    FileReader fr = new FileReader("C:\\Users\\Yogin\\Documents\\File Handling\\words.txt");  
    BufferedReader br = new BufferedReader(fr);  
    boolean found = false;  
    String word;  
    while((word = br.readLine()) != null){  
      if (searchItem.equals(word)){  
        System.out.println(word);  
        word = br.readLine();  
        System.out.println(word);  
        found = true;  
        break;  
      }  
    }  
    if (found == false){  
     System.out.println("Word not found");  
    }  
 }  
 public static void Description(String searchItem) throws IOException    {  
    FileReader fr = new FileReader("C:\\Users\\Yogin\\Documents\\File Handling\\words.txt");  
    BufferedReader br = new BufferedReader(fr);  
    boolean found = false;  
    String word, definition;  
    while((word = br.readLine()) != null){  
      definition = br.readLine();  
      if (definition.contains(searchItem)){  
        System.out.println(word);  
        System.out.println(definition);  
        found = true;  
      }  
    }  
    if (found == false){  
     System.out.println("Word not found in the description");  
    }  
 }  
}  
