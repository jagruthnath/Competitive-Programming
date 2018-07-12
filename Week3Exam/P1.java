import java.util.*;
class P1
{
	public static void main(String[] args) {
		HashMap<Character,String> hm = new HashMap<>();
		hm.put('A',".-");
		hm.put('B',"-...");
		hm.put('C',"-.-.");
		hm.put('D',"-..");
		hm.put('E',".");
		hm.put('F',"..-.");
		hm.put('G',"--.");
		hm.put('H',"....");
		hm.put('I',"..");
		hm.put('J',".---");
		hm.put('K',"-.-");
		hm.put('L',".-..");
		hm.put('M',"--");
		hm.put('N',"-.");
		hm.put('O',"---");
		hm.put('P',".--.");
		hm.put('Q',"--.-");
		hm.put('R',".-.");
		hm.put('S',"...");
		hm.put('T',"-");
		hm.put('U',"..-");
		hm.put('V',"...-");
		hm.put('W',".--");
		hm.put('X',"-..-");
		hm.put('Y',"-.--");
		hm.put('Z',"--..");
		ArrayList<String> al = new ArrayList<>();
		al.add("bhi");
		al.add("vsv");
		al.add("sgh");
		al.add("vbi");
		Set<String> hs = new HashSet<String>();
		for (String s:al)
		{
			String res="";
			char[] ch = s.toCharArray(); 
			for(char c:ch)
				res+=hm.get(Character.toUpperCase(c));
			hs.add(res);
		}
		System.out.println(hs.size());
	}
}