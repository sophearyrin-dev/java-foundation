package datastructure;
import java.util.Stack;

public class ArrayTest {
    public static void main(String[] args) {
        int numbers[] = {1,2,3};

        Stack<Integer> nums = new Stack<>();
        nums.push(1);

        nums.push(2);
        nums.push(3);

        nums.pop();
        System.out.println(nums.peek());
        System.out.println(nums);

    }
}
