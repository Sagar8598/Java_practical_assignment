//Write a java program to print an equilateral triangle using star ' * '.
public class Assg1Q4{
	public static void main(String[] args) {
		for(int i=1;i<5;i++)
		{
			for(int k=5-i;k>1;k--){
				System.out.print("   ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(" * ");
			}
			for(int l=1;l<i;l++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}