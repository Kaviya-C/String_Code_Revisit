package com.august4;

public class RemoveAllVowels 
{
	public static void main(String...args)
	{
		String name="Java Is Best";
		
		name=name.replaceAll("[AEIOUaeiou]","");
		
		System.out.println(name);
		
		String result="";
		for(int index=0;index<name.length();index++)
		{
			if(name.charAt(index)!='a'||name.charAt(index)!='e'||name.charAt(index)!='i'||name.charAt(index)!='o'||name.charAt(index)!='u')
			{
				result+=name.charAt(index);
			}
			
		}
		System.out.println(result);
	}
}
