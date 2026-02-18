import java.util.*;
class Merge
{
    public static void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the array 1 size:");
        int n1=sc.nextInt();
        System.out.println("Enter the array 2 size:");
        int n2=sc.nextInt();
        int i=0;
        int a[]=new int[n1];
        int b[]=new int[n2];
        for(i=0;i<n1;i++)
        {
           System.out.println("Enter the element "+(i+1)+" of the array:");
           a[i]=sc.nextInt(); 
        }
        for(i=0;i<n2;i++)
        {
           System.out.println("Enter the element "+(i+1)+" of the array:");
           b[i]=sc.nextInt(); 
        }
        int mrg[]=new int[n1+n2];
        int j=0,k=0;
        i=0;
        while(i<n1 && j<n2)
        {
            if(a[i]<b[j])
            {
                mrg[k++]=a[i];
                i++;
            }
            else
            {
                mrg[k++]=b[j];
                j++;
            }
        }
        while (i < n1) {
            mrg[k++] = a[i++];
        }

        while (j < n2) {
            mrg[k++] = b[j++];
        }
        for(i=0;i<k;i++)
        {
           System.out.print(mrg[i]+ " ");
        }
    }
}