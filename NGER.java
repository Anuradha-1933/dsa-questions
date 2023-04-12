import java.util.*;
class NGER{
    
    public static int[] nextGreater(int arr[]) {
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i=arr.length-1; i>=0;i--){
            while(!stack.empty() && stack.peek() <= arr[i]){
                stack.pop();
            }
            if(stack.empty()){
                ans[i] = -1;
            }else{
                ans[i]= stack.peek();
            }
            stack.push(i);
        }
        return ans;
        
    }
    public static void main(String[] args) {
        int arr[]= {2,1,5,6,2,3};
        int ans[] = nextGreater(arr);
        for(int a: ans){
                System.out.print(a + " ");
        }
    }
}