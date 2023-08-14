public class stringjoint {
	import java.util.Scanner;

			public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("enter 2 strings");
			String str1=scan.next();
			String str2=scan.next();
			System.out.println(joinStrings(str1,str2));
			
		}
		public static String joinStrings(String str1,String str2)
		{
			return str1+str2;    // concatenated two strings
		}

	}

}
