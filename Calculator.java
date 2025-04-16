import java.util.*;


public class Calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.println("enter 1st number");
        int a = sc.nextInt();
        System.out.println("enter 2nd number");
        int b = sc.nextInt();
        System.out.println("enter operation (add,subract,multiply,divide,modula):");
        String operation = sc.next();
        switch(operation){
            case "add" : System.out.println(a+b);
            break;
            case "subtract" : System.out.println(a-b);
            break;
            case "multiply" : System.out.println(a*b);
            break;
            case "divide": System.out.println(a/b);
            break;
            case "modula" : System.out.println(a%b);
            break;
            default : System.out.println("inavalid operation");
        }
    }
}
