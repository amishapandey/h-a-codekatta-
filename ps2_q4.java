import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int n=sc.nextInt();
	    String s=sc.nextLine();
	    char []ch=s.toCharArray();
	    String s1="";
	    int i;
	    for(i=0;i<ch.length;i++){
	       if(ch[i]!='a'  && ch[i]!='e' && ch[i]!='i' && ch[i]!='o' && ch[i]!='u')
	       {
	       s1+=ch[i];
	       }
	       else 
	       continue;
	    }
	    char []ch2=s1.toCharArray();
	    for(i=ch2.length-1;i>=0;i--)
	    System.out.print(ch2[i]);
	}
}
