import java.util.*;
import java.util.Arrays;

public class StackExample {

    /*public static void stackPush(Stack<Integer> stack){
        for (int i = 0; i < 20; i++){
            stack.push((int)Math.random() * 100 + 1);
        }
    }*/

    public int[] ints;

    public StackExample(){
        this.ints = new int[20];
        for (int i = 0; i < 20; i++){
            int rand = (int)Math.random() * 100 + 1;
            this.ints[i] = rand;
        }
        Arrays.sort(this.ints);
    }

    public static void main(String[] args){
        StackExample stackExample = new StackExample();
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < 20; i++){
            stack.push(stackExample.ints[i]);
        }
        for (int i = 0; i < 20; i++){
            stackExample.ints[20 - i] = stack.pop();
        }
    }
}

