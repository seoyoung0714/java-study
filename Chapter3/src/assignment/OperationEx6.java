package assignment;

public class OperationEx6 {

	public static void main(String[] args) {
		
		int num1 = 5;
		int num2 = 10;
		
		int result = num1 & num2;
		
		System.out.println(result);
		
		int num3 = 5;   // 00000101;
		
		System.out.println(num3 << 1);   // 000001010;
		System.out.println(num3);
		System.out.println(num3 << 2);   // 0000010100;
		System.out.println(num3 << 3);   // 00000101000;
		
		System.out.println(num3 >> 1);   // 0000010;

	}

}
