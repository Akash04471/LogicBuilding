import java.util.*;
class Duplicate 
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array size:");
	int n=sc.nextInt();
        int i,j,c=0;
        int arr[]=new int[10];
        for(i=0;i<n;i++)
        {
           System.out.println("Enter the element "+(i+1)+" of the array:");
           arr[i]=sc.nextInt(); 
        }
        //Without Using HashSet
        /*
        int freq[]=new int[10];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(arr[i]==arr[j])
                {
                    c++;
                    freq[j]=c;
                }
            }
            
            c=0;
        }
        for(i=0;i<10;i++)
        {
            if(freq[i]==1)
            System.out.print(arr[i]+" ");
        }
        */
       
       //Using HashSet
       HashSet<Integer> un=new HashSet<>();
       
       for(i=0;i<n;i++)
           un.add(arr[i]);
        

	System.out.print("After removing the Duplicates --> The elements are: ");
        for(int value :un)
        {
            System.out.print(value+" ");
        }
    }
}