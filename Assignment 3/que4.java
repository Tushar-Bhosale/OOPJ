public class program4
{
	public static void main(String[] args)
	{
		int num = 2823;
		float fnum = num;
		double dnum = num;
		boolean boo;
		String str = Integer.toString(num);
		if (num >=1) {
			boo = true;
		}
		else {
			boo = false;
		}
		System.out.println("boolean ::" + boo);
		System.out.println("double ::" + dnum);
		System.out.println("float ::" + fnum);
		System.out.println("String ::" + str);
	}

}