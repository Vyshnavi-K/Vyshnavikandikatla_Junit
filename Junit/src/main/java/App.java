
public class App {
	String removeA(String s)
	{
		String res = "";
		for(int i=0;i<s.length();i++)
		{
			if((i==0 || i==1) && s.charAt(i)=='A')
				continue;
			else
				res+=s.charAt(i);	
		}
		return res;
		
	}


}
