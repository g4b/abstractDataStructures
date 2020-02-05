import java.util.*;
import java.util.Arrays;

public class StackExample {

    public int[] ints;

    public StackExample(){
        this.ints = new int[20];
        for (int i = 0; i < 20; i++){
            int rand = (int) (Math.random() * 100) + 1;
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
            stackExample.ints[19 - i] = stack.pop();
        }
        System.out.println(Arrays.toString(stackExample.ints));
    }
}

