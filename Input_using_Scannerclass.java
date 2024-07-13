import java.util.Scanner;
 public class Input_using_Scannerclass{
     public static void main(String []arg){
            Scanner scanner=new Scanner(System.in);	
            
			System.out.print("Enter your name: ");
            String name=scanner.nextLine();
           	
			System.out.print("Enter your age: ");
            int age=scanner.nextInt();
            
            System.out.println("Hello!, "+name+" You are "+age+" year old.");			
	    }
    }
 