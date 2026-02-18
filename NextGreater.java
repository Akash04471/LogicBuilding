import java.util.*;
class NextGreater
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
        int n=sc.nextInt();
        int i,j,c=0;
        int arr[]=new int[n];
        for(i=0;i<n;i++)
        {
           System.out.println("Enter the element "+(i+1)+" of the array:");
           arr[i]=sc.nextInt(); 
        }
        Stack<Integer> stack=new Stack<>();
        int out[]=new int[n];
        for (i=n-1;i>=0;i--)
        {
           while(!stack.isEmpty() && arr[i]>=stack.peek())
           {
               stack.pop();
           }
           if(stack.isEmpty()){
               out[i]=-1;
            }
            else{
                out[i]=stack.peek();
            }
           stack.push(arr[i]);
        }
        for(i=0;i<n;i++)
        {
            System.out.print(out[i]+" ");
        }
    }
}