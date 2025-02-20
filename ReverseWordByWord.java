package javaprograms;

public class ReverseWordByWord {

	public static void main(String[] args) {
		String Line = "We are learning Java";
		String word[]= Line.split(" ");
		
		for(int i=word.length-1;i>=0;i--)
		{
			System.out.print(word[i]+" "); 
		}
		
	}

}
