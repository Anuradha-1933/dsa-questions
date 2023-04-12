import java.util.Stack;

public class NGEL {
    //THIS IS A STACK OF NSEL OF INDICES
    public static int[] nextGreaterElementinLeft (int arr[]){
        Stack<Integer> stack = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i=0 ; i<arr.length; i++){
            while( ! stack.isEmpty() && arr[stack.peek()] <= arr[i] ){
                stack.pop();
            }
            if(stack.isEmpty()){
                ans[i] = -1;
            }
            else{
                ans[i] = stack.peek();
            }
            stack.push(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        int arr[]= {4, 7, 6, 9, 2, 8, 4, 7, 9};
        int ans[] = nextGreaterElementinLeft(arr);
        for(int a: ans){
                System.out.println(a);
        }
    }
    
}
