import java.util.*;

public class hello
{
	public static void main(String[] args)
	{	
		int[] a = new int[5];
		a[0]=1;
		a[1]=2;
		a[2]=3;
		a[3]=4;
		a[4]=5;
	//	for(int el : a)
	//		System.out.println(el);
	// ������������ �����������	
	//	for(int el = 0; el < 5 ;el++)
	//		{
	//		System.out.println(a[el]);
	//		}
		System.out.print("������, ������ ���-������: ");
		Scanner in= new Scanner(System.in);
		String app = in.nextLine();
		System.out.println("�� �������: " + app);
	}
}
