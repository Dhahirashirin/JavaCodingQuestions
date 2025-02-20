package javaprograms;

public class ReverseString1 {

	public static void main(String[] args) {
		String OrgStr = "Automation";
		String RevStr="";
		for(int i =0; i<OrgStr.length();i++)
		{
			RevStr=OrgStr.charAt(i)+RevStr;
		}
			System.out.print("Reversed String : " + RevStr);	
	}

}
