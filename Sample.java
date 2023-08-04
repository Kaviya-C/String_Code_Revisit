package com.august4;


import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Sample 
{
	static String recursive(String input)
	{
		if(input==null || input.length()<=1)
		{
			return input;
		}
		else
		{
			return recursive(input.substring(1))+input.charAt(0);
		}
	}
	public static void main(String...args)
	{
		String name="Java Developer Kaviya";
		
		char[] character=name.toCharArray();
		
		Map<Character,Integer> map=new HashMap<>();
		
		for(char each:character)
		{
			if(map.containsKey(each))
			{
				map.put(each, map.get(each)+1);
			}
			else
			{
				map.put(each,1);
			}
		}
		
		System.out.println(name);
		System.out.println(map);
		
		Set<Character> keys=map.keySet();
		
		for(char c:keys)
		{
			if(map.get(c)>1)
			{
				System.out.println(c+" : "+map.get(c));
			}
		}
		
		
		
		String result="";
		
		for(int index=0;index<name.length();index++)
		{
			if(name.charAt(index)!=' ' && name.charAt(index)!='\t')
			{
				result+=name.charAt(index);
			}
		}
		System.out.println(result);
		
		
		String s=recursive(name);
		System.out.println("Recurive reverse string: "+s);
		

	}

}
