package MethodOverLoading;

public class OverloadMethod {

	public int calculate(int a,int b){
		int c=a+b;
		return c;
	}
	
	public float calculate(float r){
		float c=3.14f*r*r;
		return c;
	}
	
	public float calculate(float a, float b){
		float c=a*b;
		return c;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadMethod ob = new OverloadMethod();
		int add=ob.calculate(2, 4);
		float circle=ob.calculate(5.2f);
		float rectangle= ob.calculate(4.0f,2.0f);
		
		System.out.println("ADD "+add+", circle "+circle+", rectangle "+rectangle+".");
		
	}

}
