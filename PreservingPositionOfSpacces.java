package com.august4;

public class PreservingPositionOfSpacces {
	public static void main(String... args) {
	
		String name="Java devloper kaviya";
		
		char[] first=name.toCharArray();
		
		char[] result=new char[first.length];
		
		for(int start=0;start<first.length;start++)
		{
			if(first[start]==' ')
			{
				result[start]=' ';
			}
		}
		int next=result.length-1;
		
		for(int index=0;index<first.length;index++)
		{
			if(first[index]!=' ')
			{
				if(result[next]==' ')
				{
					next--;
				}
				result[next]=first[index];
				next--;
			}
		}
		System.out.println(String.valueOf(result));
	}
}
