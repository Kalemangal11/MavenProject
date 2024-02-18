package firstprogram;

public class Literals {

public static void main(String[] args) {
	
	//Java is depend on UNICODE Values therefore java is a case sensitive language 
	
	//Allowed characters are (a to z) or (A to Z)
	
//A) Integral Literal	
	
	int x=0; //decimal literal
	int y=010; //octal literal
	int z=0X10; //Hexadecimal literal
	
//B) Floating point literal	
	
	float f=234.565f;
	double d=4343.786;
	
//C) Boolean literal
	
	boolean b=true;
	//boolean b1=True; //T(capital T) not allowed
	//boolean b3=0; //0 or 1 not allowed
	
//D)Character literal
	char ch='a';
	//char ch1="a"; char ch2='ab';  //not allowed
	char ch3=0777;
	char cr=65535;
//	char cr1=65536; //not allowed
	char ch4=0XFace;
	char ch6='\u0061';
	char ch5=0xface;

}
}
