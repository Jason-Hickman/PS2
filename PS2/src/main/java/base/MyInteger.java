package base;

public class MyInteger {
		
	private static int iValue;
	private int value;
	private MyInteger x = new MyInteger();
	
	MyInteger(){
		value = iValue;
	}
	
	public int getiValue(){
		return iValue;
	}
	
	public static void setiValue(int x){
		iValue = x;
	}
	
	public boolean isEven(){
		return (iValue%2 == 0);
	}
	
	public boolean isOdd(){
		return (iValue%2 == 1);
	}
	
	public boolean isPrime(){
		for(int x = 2; x < iValue; x++){
			if(iValue%x == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isEven(int x){
		return (x%2 == 0);
	}
	
	public static boolean isOdd(int x){
		return (x%2 == 1);
	}
	
	public static boolean isPrime(int x){
		for (int y = 2; y < x; y++){
			if(x%y == 0){
				return false;
			}
		}
		return true;
	}

	public static boolean isEven(MyInteger x){
		return (x.value%2 == 0);
	}
	
	public static boolean isOdd(MyInteger x){
		return (x.value%2 == 1);
	}
	
	public static boolean isPrime(MyInteger x){
		for(int y = 2; y < x.value; y++){
			if(x.value%y == 0){
				return false;
			}
		}
		return true;
	}
	
	public static boolean equals(int x){
		return (x == iValue);
	}
	
	public static boolean equals(MyInteger x){
		return (x.value == iValue);
	}
	
	}
