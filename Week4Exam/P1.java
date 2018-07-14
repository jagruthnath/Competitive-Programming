import java.util.*;
class P1
{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int x = S.nextInt();
		int y = S.nextInt();
		char[] a = decToBin(x).toCharArray();
		char[] b = decToBin(y).toCharArray();
		int count=0;
		int big=a.length>b.length?a.length:b.length;
		int small=a.length<b.length?a.length:b.length;
		for(int i=0; i<small; i++)
			if(a[i]!=b[i])
				count++;
		int j;
		if(big==a.length)
			j=b.length;
		else
			j=a.length;
		while(j<big)
		{
			if(j==b.length)
			{
				if(a[j]=='1')
					count++;
			}
			else
			{
				if(b[j]=='1')
					count++;
			}
			j++;
		}
		System.out.println(count);
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