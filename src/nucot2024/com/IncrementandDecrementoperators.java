package nucot2024.com;

public class IncrementandDecrementoperators {

	public static void main(String[] args) {
		
		//++ and -- 
		// ++
		//post increment variable_name++; example a++
		//pre increment ++variable_name; example ++a
		
		// --
		//post decrement variable_name--; example a--
		//pre decrement --variable_name; example --a
		
		
		//postincrement a++
		
		int i=1;  
		int ii=i++;  // ii=i++ means i,i+1---> ii=1++ ii=1,i=2
		System.out.println(i); //2
        System.out.println(ii); //1
        
        int j=2;
		int jj=j++;  // jj=j++ means j,j+1---> jj=2++ ii=2,i=3
		System.out.println(j); //3
        System.out.println(jj); //2
        
        //preincrement ++a
        
        int l=1;
		int ll=++l; // ll=++l means l+1,l---> ll=++1 ll=2,i=2
		System.out.println(l); //2
        System.out.println(ll); //2
        
        int m=2;
		int mm=++m;  // mm=++m means m+1,m---> mm=++2 mm=3,m=3
		System.out.println(m); //3
        System.out.println(mm); //3
        
        //postdecrement a--
        
        int x=1;  
		int xx=x--;  // xx=x-- means x,x-1---> xx=1-- xx=1,x=0
		System.out.println(x); //0
        System.out.println(xx); //1
        
        
        int y=2;  
		int yy=y--;  // yy=y-- means y,y-1---> yy=2-- yy=2,y=1
		System.out.println(y); //1
        System.out.println(yy); //2
       
        //predecrement --a
        
        int u=1;  
		int uu=--u;  // uu=--u means u-1,u---> uu=--1 uu=1,u=0
		System.out.println(u); //0
        System.out.println(uu); //0
        
        
        int v=2;  
		int vv=--v;  // vv=--v means v-1,v---> vv=--2 vv=2,y=1
		System.out.println(v); //1
        System.out.println(vv); //1
       
        
        
        
        
	}

}
