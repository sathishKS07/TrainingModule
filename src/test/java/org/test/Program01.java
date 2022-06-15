package org.test;

public class Program01 {
	
	public static void main(String[] args) {
		
		String S1="Sathish Ka StringS";
	
		String[] split1=S1.split(" ");
		for (int i = 0; i < split1.length; i++) {
			String S2="";
			char ch;
			for (int j = 0; j < split1[i].length(); j++) {
				ch=split1[i].charAt(j);
				S2=ch+S2;		
			}
			System.out.print(S2+" ");		
		}
	
		
		
		
		char arr[] =S1.toCharArray();
		int count;
		for (int i = 0; i < arr.length; i++) {
			count=1;
		for (int j = i+1; j < arr.length; j++) {
			if(arr[i]==arr[j]&&arr[i]!=' ') {
				count++;
				arr[j]='0';			
			}
			}
	if(count>1&&arr[i]!='0') {
		System.out.println(arr[i]+" "+count);
			
		}	
		}	
	String str="qw23@1TEagbcA";
	str=str.replaceAll("[^0-9A-Z]", "");
	System.out.println(str);
	
	int a= 22;
	
	if(a%2==0) {
		System.out.println(a);
	}
	
	int sumOdd=0;
	for(int i=1;i<=100;i++) {
		
		if((i%2==1)) {
			System.out.print(i);
			System.out.println();
			sumOdd=i+sumOdd;
				
		}
		
	
		
	}
	
	System.out.println(sumOdd);
	    
	int   n1=0;
	int   n2=1;
	int  n3=0;
	   
	  for (int i = 0; i <=5; i++) {
		  
		 n3 =n1+n2;
		 n1=n2;
		 n2=n3;
	}  
	  System.out.println(n3);
	    
	  
	  int s=5;
	  int a1=1;
	  for (int i = 1; i <=s; i++) {
		  
		  a1=a1*i;
		
	}
	  System.out.println(a1);   
	  
	  
	  for (int i = 0; i <7; i++) {
		 
		  for (int j = 0; j < i+1; j++) {
			  System.out.print("*");
			
		}
		System.out.println(" ");
	}
	  
	  
	  for (int i = 0; i < 10; i++) {
		
		  for (int j = (10-i); j >0; j--) {		  
			  System.out.print(" ");	
		}
		  
		  for (int j = 0; j <i+1; j++) {
			  System.out.print("* ");
		}
		  System.out.println();  
	}
	    
	  
	  int given=121;
	  int temp=given;
	  int m=0;
	  int n=0;
	  
	  while(temp>0) {
		  
	
		  
		  
		  
		  
		  
	  }
	    
	       
	    
	    
	    
	    
	    
	    
	    
	    
	    
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
	}    
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
