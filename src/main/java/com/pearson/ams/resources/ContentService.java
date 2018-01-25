package com.pearson.ams.resources;

public class ContentService {
	public int add(int a,int b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("hello from simple application");
ContentService d=new ContentService();
int res=d.add(4, 5);
System.out.println(res);
	}

}
