package com.dilu.test;

public class Fibon {
	
	public int fibo(int x) {
		if(x == 0)
			return 0;
		if (x==1)
			return 1;
		return  0;//fibo(x:x-1) + fibo(x:x-1);
	}

	public static void main(String[] args) {
		

	}

}
