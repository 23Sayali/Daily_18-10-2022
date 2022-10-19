
package Polymorphysm;

import java.util.Scanner;

public class class1
{
       private int a=10;
		private String pwd; 
		private int blance=100;    
		public int user_id;   
		protected String jewellery="gold";
		 
		
		void method1()
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("enter User id");
			 user_id = sc.nextInt();
			System.out.println("enter pwd");
			 pwd = sc.next();	 
		 
	     }
		
		
		public String getPwd() {
			return pwd;
		}
		public void setPwd(String pwd) 
		{
			this.pwd = pwd;
		}
		
		public int getBlance() {
			return blance;
		}
		public void setBlance(int blance) {
			this.blance += blance;
		}
		
	
}




package Polymorphysm;

import java.util.Scanner;

public class class2  
{
	public static void main(String[] args) 
	{
		String pwd1 ="komal";
		int blance;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter blance");
		blance = sc.nextInt();
		
		class1 obj1=new class1();
		obj1.method1();
		obj1.setBlance(blance);
		obj1.setPwd(pwd1);
		
	
	
		System.out.println(obj1.user_id+" = this user id  is Public");
		System.out.println(obj1.getPwd()+" = this password is Private");
		System.out.println(obj1.getBlance()+" = this blance is Private");
		System.out.println(obj1.jewellery+" = this axcessable for only derive class ");
	}
}