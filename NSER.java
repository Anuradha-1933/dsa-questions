
import java.util.*;
public class NSER {
    

    public static int[] nextGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1; i>=0;i--){
            while(!stack.isEmpty() && stack.peek() >= arr[i]){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }else{
                ans[i]= stack.peek();
            }
            stack.push(arr[i]);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]= {4, 7, 6, 9, 2, 8, 4, 7, 9};
        int ans[] = nextGreater(arr);
        for(int a: ans){
                System.out.println(a);
        }
    }
}
    

