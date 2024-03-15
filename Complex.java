import java.util.*;
class Hello{
float r;
float i;
	Hello(int n){
	Scanner s = new Scanner(System.in);
	System.out.println("Enter "+n+"th real part:");
	r=s.nextFloat();
	System.out.println("Enter "+n+"th imaginary part:");
	i=s.nextFloat();
	}
}
class Complex{
	public static void main(String a[]){
	Hello h= new Hello(1);
	Hello p= new Hello(2);
	float real=h.r+p.r;
	float imag=p.i+h.i;
	System.out.println("The complex number is: "+real+"+"+imag+"i");
	}
}
