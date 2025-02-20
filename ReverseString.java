package javaprograms;

public class ReverseString {

	public static void main(String[] args) {
		
		String OrgStr = "Management"; 
		char [] ch = OrgStr.toCharArray(); //'M','a'....................,'t'
		for (int i=OrgStr.length()-1; i >= 0 ; i--)
		{
			System.out.print(ch[i]);
		}
}
	
}