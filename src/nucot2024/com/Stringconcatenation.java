package nucot2024.com;

public class Stringconcatenation {

	public static void main(String[] args) {
		//NON PRIMITIVE DATA TYPES
		//1. STRING ANYTHING HICH IS ENCLOSED BETWEEN DOOUBLE QUOTES IS CALLED STRING 
		//--> HEAP MEMORY-->SCP(STRING CONSTANT POOL)-->STRING
		//SYNTAX STRING VARIABLE NAME=VALUE; (STRING INITIALIZATION)
		
		String s="welcome nucot";
		System.out.println(s);
		String ss="s";
		System.out.println(ss);
		String sss=" ";     //IF THERE IS NO VALUE IN DOUBLE QUOTES THEN OUTPUT WILL SHOW NOTHING
	    System.out.println(sss);
	    
	    //STRING WITH BYTE
	    
	    byte a=3;
	    byte b=6;
	    System.out.println(a+b);// op 9
	    
	    //WHENEVER WE USE '+' OPERTOR BETWEEN TWO STRINGS IT WILL ACT AS CONCATENATOR
	    
	    String m= "modi";
	    String n= "bangalore";
	    System.out.println(m+n); //op modibangalore
	    System.out.println(a+m); //3modi
	    System.out.println(a+b+m+n); //9modibangalore
	    System.out.println(m+n+a+b); //modibangalore36
	    System.out.println(m+n+(a+b)); //modibangalore9
	    System.out.println(a+b+m+n+a+b); //9modibangalore36
	    System.out.println(a+b+m+n+(a+b)); //9modibangalore9
	    
	    //STRING WITH SHORT
	    
	    short c=70;
	    short d=30;
	    System.out.println(c+d); //op 100
	    

	    String p= "modi";
	    String q= "bangalore";
	    System.out.println(p+q); //modibangalore
	    System.out.println(c+p); //70modi
	    System.out.println(c+d+p+q); //100modibangalore
	    System.out.println(p+q+c+d); //modibangalore7030
	    System.out.println(p+q+(c+d)); //modibangalore100
	    System.out.println(c+d+p+q+c+d); //9modibangalore7030
	    System.out.println(c+d+p+q+(c+d)); //9modibangalore100
	    
	    //STRING WITH INT
	    
	    int e=1;
	    int f=2;
	    System.out.println(e+f);//op 3
	    
	    String x= "modi";
	    String y= "bangalore";
	    System.out.println(x+y); //modibangalore
	    System.out.println(e+x); //1modi
	    System.out.println(e+f+x+y); //3modibangalore
	    System.out.println(x+y+e+f); //modibangalore12
	    System.out.println(x+y+(e+f)); //modibangalore3
	    System.out.println(e+f+x+y+e+f); //3modibangalore12
	    System.out.println(e+f+x+y+(e+f)); //3modibangalore3
	    
	    //STRING WITH LONG
	    
	    long g= 25l;
	    long h= 26l;
	    System.out.println(g+h); //op 51
	    

	    String w= "modi";
	    String z= "bangalore";
	    System.out.println(w+z); //modibangalore
	    System.out.println(g+w); //25modi
	    System.out.println(g+h+w+z); //25modibangalore
	    System.out.println(w+z+g+h); //modibangalore2526
	    System.out.println(w+z+(g+h)); //modibangalore51
	    System.out.println(g+h+w+z+g+h); //51modibangalore2526
	    System.out.println(g+h+w+z+(g+h)); //51modibangalore51
	    
	    //STRING WITH FLOAT 
	    
	    float i=1.2f;
	    float j=1.3f;
	    System.out.println(i+j);
	    
	    
	    String u= "modi";
	    String v= "bangalore";
	    System.out.println(u+v); //modibangalore
	    System.out.println(i+u); //1.2modi
	    System.out.println(i+j+u+v); //2.5modibangalore
	    System.out.println(u+v+i+j); //modibangalore1.21.3
	    System.out.println(u+v+(i+j)); //modibangalore2.5
	    System.out.println(i+j+u+v+i+j); //2.5modibangalore1.21.3
	    System.out.println(i+j+u+v+(i+j)); //2.5modibangalore2.5
	    
	    
	    //STRING WITH DOUBLE
	    
	    double k=2.56;
	    double l=2.56;
	    System.out.println(k+l); //5.12
	    
	    
	    String o= "modi";
	    String r= "bangalore";
	    System.out.println(o+r); //modibangalore
	    System.out.println(k+o); //2.56modi
	    System.out.println(k+l+o+r); //5.12modibangalore
	    System.out.println(o+r+k+l); //modibangalore2.562.56
	    System.out.println(o+r+(k+l)); //modibangalore5.12
	    System.out.println(k+l+o+r+k+l); //5.12modibangalore2.562.56
	    System.out.println(k+l+o+r+(k+l)); //5.12modibangalore5.12
	    
	    //STRING WITH CHARACTER
	    
	    char t='a';
	    char tt='b';
	    System.out.println(t+tt); //op 195
	    
	    
	    String oo= "modi";
	    String rr= "bangalore";
	    System.out.println(oo+rr); //modibangalore
	    System.out.println(t+oo); //amodi
	    System.out.println(t+tt+oo+rr); //195modibangalore
	    System.out.println(oo+rr+t+tt); //modibangaloreab
	    System.out.println(oo+rr+(t+tt)); //modibangalore195
	    System.out.println(t+tt+oo+rr+t+tt); //195modibangaloreab
	    System.out.println(t+tt+oo+rr+(t+tt)); //195modibangalore195
	   
	    
	    //STRING WITH BOOLEAN DATA TYPE
	    
	    boolean aa= true;
	    boolean bb= false;
	   
	   // doubt here cant we do strings with boolean 
	    
	   // IF WE DONT KNOW CHARACTR VALUE WE CAN FIND IT BY USING BELOW LINE
	    
	    System.out.println((byte)'a');
	    System.out.println((byte)'G');
	    System.out.println((byte)'9');
	    System.out.println((byte)'&');
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}

}
