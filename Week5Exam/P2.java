import java.util.*;
class P2
{
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		int x = S.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int j = 0; j <= x; j++)
        {
            String binary = decToBin(j);
            int count=0;
            for(int i = 0; i < binary.length(); i++)
                if(binary.charAt(i)=='1')
                    count++;
            arr.add(count);
        }
		System.out.println(arr);
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