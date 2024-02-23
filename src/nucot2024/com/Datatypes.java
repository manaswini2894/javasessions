package nucot2024.com;

public class Datatypes {

	public static void main(String[] args) {
		//IN ORDER TO INSTRUCT THE COMPILER TO CREATE MEMORY LOCATIONS WE NEED DATA TYPES
		//1 PRIMITIVE DATATYPE OR BUILT IN DATATYPE
		//2 NON PRIMITIVE DATATYPE
		//1.a.boolean datatype
		//1.b.numeric datatype---b.1.character type(char)
		//                         2.integral value------->b.2.1.integer type-- byte,short,int,long
		//                                                 b.2.2.float point-- float double
		//VARIABLE: IT IS NAME GIVEN TO THE MEMORY LOCATIONS WHERE WE CAN STORE THE VALUES
		// VARIABLE DECLARATION 
		// SYNTAX data_type variable_name;
		// VARIABLE INITIALIZATION 
		// SYNTAX data_type variable_name=value;
		 
	System.out.println("this is byte data type"); // 1 byte= 8bits
	byte b=8;
	System.out.println(b);
	//NOTE in java memory names cannot be same it will throw error
	byte bb=113;
	System.out.println(bb);
   
	System.out.println("this is short data type"); // 2 bytes= 16bits
	short s=13;
	System.out.println(s);
    short ss=-32768;
    System.out.println(ss);
    
    System.out.println("this is int data type"); // 4bytes= 32bits
    int i=67;
    System.out.println(i);
    int ii=20567;
    System.out.println(ii);
    
    System.out.println("this is long data type"); //8bytes= 64bits 
    // in long data type we need to add l after value
    long l=12l;
    System.out.println(l);
    long ll=-890087566l;
    System.out.println(ll);
    
    System.out.println("this is float data type"); //4bytes= 32bits
    // in float in order differentiate bw flaot and double we need to add f after value
    float f=3.4f;
    System.out.println(f);
    float ff=2.34456f;
    System.out.println(ff);
    
    System.out.println("this is double data type"); //8bytes= 64bits
    double d=10.890;
    System.out.println(d);
    double dd=1.79769;
    System.out.println(dd);
    
    System.out.println("this is character data type"); //2bytes= 16bits
    //anything which is enclosed between single quotes is called character data type
    char c='a';
    System.out.println(c);
    char cc='$';
    System.out.println(cc);
    //note whenever we declare character bit it should be in single digit in single quotes
    // characters a to z, A to Z, 0 to 9 and all special characters 
    
    System.out.println("this is boolean data type"); // 1 bit
    // true or false
    boolean h=true;
    System.out.println(h);
    boolean hh=false;
    System.out.println(hh);
    
    
    
	}

}
