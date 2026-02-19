import java.util.*;
class ReverseWordWise
{
    public static void main(String [] args)
    {
        ReverseWordWise ob=new ReverseWordWise();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence to reverse wordwise: ");
        String s=sc.nextLine();
        char ch;
        String word="",rev="";
        int pos=-1;
        s=s+" ";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ')
            {
                word=s.substring(pos+1,i);
                rev=word+" "+rev;
                pos=i;
            }
        }
        System.out.println("WordWise Reversed Sentence:"+rev);
    }
}