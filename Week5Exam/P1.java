import java.util.*;
class P1
{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int x = S.nextInt();
		String binary = decToBin(x);
        int i = binary.length()-1;
        while(binary.charAt(i)=='0') 
            i--;
        int gap = 0;
        int counter = 0;
        for(; i>=0; i--) 
        {
            if(binary.charAt(i)=='1') 
            {
                gap = Math.max(gap, counter);
                counter = 0;
            } 
            else
                counter++;
        }
        gap = Math.max(gap, counter);
		System.out.println(gap);
	}

	static String decToBin(int x)
	{
		String a="";
		int p;
		int count=0;
		while(x > 0)
        {
            p = x % 2;
            if(p == 1)
                count++;
            a = a + "" + p;
            x = x / 2;
        }
        return a;
	}
}