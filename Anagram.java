package com.august4;

public class Anagram 
{
	public static void main(String...args)
	{
		String first="Hitler woman";
		String second="Mother in law";
		
		first=first.replaceAll("\\s+", "").toLowerCase();
		second=second.replaceAll("\\s+", "").toLowerCase();
		
		boolean status=true;
		
		if(first.length()!=second.length())
		{
			status=false;
			
		}
		else
		{
			char[] firstArray=first.toCharArray();
			StringBuilder sb=new StringBuilder(second);
			for(char c:firstArray)
			{
				int index=sb.indexOf(""+c);
				if(index!=-1)
				{
					sb.deleteCharAt(index);
					//second=second.substring(0,index)+second.substring(index+1,second.length());
				}
				else
				{
					status=false;
					break
					;
				}
			}
			if(status)
				System.out.println("Two string are anagram");
			else {
				System.out.println("Not anagram");
			}
		}
	}

}
