
import java.util.Scanner;

public class Calculate {
	public static void main(String[] arg) {
		boolean is_exit = false;
		int action, a = 0, b = 0, c = 0;
		Scanner scanner = new Scanner(System.in);
		while (!is_exit) {
			System.out.println("===========================================");
			System.out.println("1 - ��������");
			System.out.println("2 - ���������");
			System.out.println("3 - ���������");
			System.out.println("4 - �������");
			System.out.println("5 - �������");
			System.out.println("");
			System.out.println("0 - ����� �� ���������");
			System.out.println("-------------------------------------------");
			System.out.print("�������� ��������: ");
			
			action = scanner.nextInt();
			
			if (action == 0) {
				return;
			} else if (action > 0 && action < 6) {
				System.out.print("������� ������ ��������: ");
				a = scanner.nextInt();				
				System.out.print("������� ������ ��������: ");
				b = scanner.nextInt();
				System.out.println("");

				switch(action) {
					case 1:
						c = a + b;
						break;
					case 2:
						c = a - b;
						break;
					case 3:
						c = a * b;
						break;
					case 4:
						c = a / b;
						break;
					case 5:
					c = a % b;
						break;				
				}
				System.out.println("���������: " + c);	
				System.out.println("");				
			}
		}
	}
}

