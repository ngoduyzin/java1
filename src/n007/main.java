package n007;

public class main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean cont = true;
		do {
			System.out.println("Chọn chức năng : [1- 10]");
			int chon = input.nextInt();
			switch (chon) {
			case 1:
				float a=5,b=2,c=1;
				N3_2.ptbac2(a, b, c);
				break;
			case 2:
				int n=5;
				long rs=N3_2.GT(n);
				System.out.printf("\n%d!=%d", n,rs);
				break;
			case 3:
				int k=5;
				long t =N3_2.fibo(n);
				System.out.printf("\n%d!=%d", k,t);
				break;
			case 4:
				int m = 5;
				N3_2.uocchungboichung(n, k);
				break;
			case 5:
				int h = 5;
				N3_2.DQGT(n);
				break;
			case 6:
				int l = 5;
				N3_2.SNT(n);
				break;
			case 7:
				int o = 5;
				N3_2.SNT2(n);
				break;
			case 8:
				int u = 5;
				N3_2.SNT3();
				break;
			case 9:
				int d = 5;
				N3_2.tongChuSo(n);
				break;
			case 10:
				int count = 0;
		        for (int i = 100000; i < 1000000; i++) {
		            if (N3_2.isThuanNghich(i)) {
		                System.out.println(i);
		                count++;
		            }
		        }
		        System.out.println("Tổng các số thuận nghịch có 6 chữ số: "
		                + count);         
				break;
			case 11:
				int e = 7;
				N3_2.lietKe(count);
				break;
		    
			default:
				System.out.println("Tạm biệt");
				cont = false;
				break;
			}
		} while (cont);
	}
		static void Menu () {
			System.out.printf("%-6s%s\n", "[1]", "Phuong trinh bac hai");
			System.out.printf("%-6s%s\n", "[2]", "Giai thua");
			System.out.printf("%-6s%s\n", "[3]", "So Fibonacci");
			System.out.printf("%-6s%s\n", "[4]", "UCLN & BCNN");
			System.out.printf("%-6s%s\n", "[5]", "de quy giai thua");
			System.out.printf("%-6s%s\n", "[6]", "Liet ke cac so nguyen to nho hon n");
			System.out.printf("%-6s%s\n", "[7]", "Liet ke n  so nguyen to dau tien");
			System.out.printf("%-6s%s\n", "[8]", "liet ke so nguyen to co 5 chu so");
			System.out.printf("%-6s%s\n", "[9]", "tong chu so");
			System.out.printf("%-6s%s\n", "[10]", "so thuan nghich");
			System.out.printf("%-6s%s\n", "[11]", "Liet ke cac so Fibonacci nho hon n la so nguyen to");

		}
		
		
		
		
		
		
		
				

	}

}
