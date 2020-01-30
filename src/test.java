import java.util.Scanner;
import java.util.Stack;

public class test {


    public static void main (String[] args){
        Scanner in = new Scanner;
        System.out.print("Hei");
        Stack<Integer> stack = new Stack<>();
        System.out.print("Gi meg 5 tall");
        for (int i = 0; i < 4; i++){
            stack.push(in.nextInt());
        }
        for (int i = 0; i < 4; i++){
            System.out.print(stack.pop());
        }
    }
}

