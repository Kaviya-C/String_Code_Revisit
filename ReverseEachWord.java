package com.august4;

public class ReverseEachWord
{
	public static void main(String...args)
	{
	
		String name="Developer Java Kaviya";
		
		String[] array=name.split("\\s+");
		
		String reverse="";
		for(int index=array.length-1;index>=0;index--)
		{
			reverse+=array[index]+" ";
		}
		System.out.println(reverse);
	}

}
