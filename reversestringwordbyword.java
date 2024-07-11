import java.util.*;

public class reversestringwordbyword
{
   public static void main(String[] args)
   {    
        Scanner in=new Scanner(System.in);
        String finalline="",word=" ";
                System.out.println("ENTER THE LINE");
        String line=in.nextLine();
        line=line+" ";
        int length=line.length();
         for(int i=0;i<length;i++)
        {
            char character = line.charAt(i);
            if(character==' ')
            {
              finalline=finalline+word;
              word=" ";
            }
            else
            word=character+word;
        }
        System.out.println("OUTPUT");
        System.out.println(finalline);
    }
}