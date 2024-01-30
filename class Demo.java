package demo;
import java.util.*;
import java.util.Random;
public class Demo {
   public static void main(String[] args) {
	   System.out.println("********");
	   System.out.println(" Paper rock scissor");
	   System.out.println("********");
	   int a=10;
	   int H=0;
	   int AI=0;
	   int no=0;
	   while(a>0) {
		   display();
		   System.out.println("Enter your option");
		   Scanner s= new Scanner(System.in);
		   String c=s.nextLine();
		   Random r=new Random();
		   if(no>5) {
			   System.out.println("Final Score");
			   System.out.println("Human:"+H+"|AI: "+AI);
		   }
		   if(c.equals("R")) {
			   int comp=10+r.nextInt(3)+1;
			   if(comp==11) {
				   System.out.println("You:Rock");
				   System.out.println("AI:Rock");
				   System.out.println("Result:Draw");
				   no=no+1;
				   H=H+1;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }else if(comp==12) {
				   System.out.println("You:Rock");
				   System.out.println("AI:paper");
				   System.out.println("Result:Lost");
				   no=no+1;
				   H=H+0;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }else if(comp==13) {
				   System.out.println("You:Rock");
				   System.out.println("AI:Scissor");
				   System.out.println("Result:Win");
				   no=no+1;
				   H=H+1;
				   AI=AI+0;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }
		   }
		   if(c.equals("P")) {
				   int comp=20+r.nextInt(3)+1;
			   if(comp==21) {
				   System.out.println("You:Paper");
				   System.out.println("AI:Rock");
				   System.out.println("Result:Win");
				   no=no+1;
				   H=H+1;
				   AI=AI+0;
				   System.out.println("Human:"+H+"|AI: "+AI);
				   
			   }else if(comp==22) {
				   System.out.println("You:Paper");
				   System.out.println("AI:paper");
				   System.out.println("Result:Draw");
				   no=no+1;
				   H=H+1;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }else if(comp==23) {
				   System.out.println("You:Paper");
				   System.out.println("AI:Scissor");
				   System.out.println("Result:Lose");
				   no=no+1;
				   H=H+0;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
		   }
		   }		 
		   if(c.equals("S")) {
			   int comp=30+r.nextInt(3)+1;
			   if(comp==31) {
				   System.out.println("You:Scissor");
				   System.out.println("AI:Rock");
				   System.out.println("Result:Lose");
				   no=no+1;
				   H=H+0;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }else if(comp==32) {
				   System.out.println("You:Scissor");
				   System.out.println("AI:paper");
				   System.out.println("Result:Win");
				   no=no+1;
				   H=H+1;
				   AI=AI+0;
				   System.out.println("Human:"+H+"|AI: "+AI);
			   }else if(comp==33) {
				   System.out.println("You:Scissor");
				   System.out.println("AI:Scissor");
				   System.out.println("Result:Draw");
				   no=no+1;
				   H=H+1;
				   AI=AI+1;
				   System.out.println("Human:"+H+"|AI: "+AI);
	           }
		   }
		   }
   }
   public static void display() {
	   System.out.println("1 Rock:R");
	   System.out.println("2 Paper:P");
	   System.out.println("3 Scissor:S");
	   
   }

}
