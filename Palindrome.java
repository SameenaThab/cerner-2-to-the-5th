import java.util.*;

public class Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        if(is_palindorme(num)) System.out.println(num+" is palindorme"); else System.out.println(num+" is not palindorme");
    }

    public static boolean is_palindorme(int num)
    {
        String str = Integer.toString(num);
        int len = str.length();
        int i=0,j=len-1;
        while(i != j)
        {
            if(str.charAt(i) != str.charAt(j))
            {
             i++;
             j--;   
            }
            else
                return false;
        }
        return true;
    }
}