//String and functions
//Name: Yogesh Pawar
import java.util.*;

class Program1
{

	static void indexpass(String valuee  )
	{
		System.out.println("I am In the Class:"+valuee);
		/*for(int j=0;j<=valuee.length-1;j++)
		{
			System.out.println("I am in class of index"+j+"is:"+valuee[j]);
		}*/
	}
	public static void main(String arg[])
	{
		String str="Hi I am Yogesh Pawar";
		System.out.println("str starts with hi:"+str.startsWith("hi"));
		System.out.println("str ends with awar:"+str.endsWith("awar"));
		System.out.println("str contains am:"+str.contains("am"));
		System.out.println("index of Y:"+str.indexOf('Y'));
		System.out.println("str to UpperCase:"+str.toUpperCase());	
		System.out.println("str to LowerCase:"+str.toLowerCase());
		System.out.println("str print from index 5:"+str.substring(5));
		System.out.println("str print from 5 to 9:"+str.substring(5,10));
		System.out.println("str char at index 8:"+str.charAt(8));
		System.out.println("str length is:"+str.length());

		String[] strarr=str.split(" ");
		System.out.println("------------------------------------------------");
		for(int i=0;i<=strarr.length-1;i++)
		{
			System.out.println("Value at index"+i+"is:"+strarr[i]);
		} 
		System.out.println("------------------------------------------------");

		indexpass(strarr[3]);

		System.out.println("------------------------------------------------");



	}
}