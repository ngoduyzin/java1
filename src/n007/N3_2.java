package n007;
import java.util.ArrayList;
import java.util.List;

public class N3_2 {
	
	public static void ptbac2(float a,float b ,float c) {
        double denta = b * b - 4 * a * c;
	    
	    if ( denta > 0) {
	      double x1 = (-b + Math.sqrt(denta)) / (2 * a);
	      double x2 = (-b - Math.sqrt(denta)) / (2 * a);
	      
	      System.out.println("nghiem " + x1 + " va " + x2);
	    } else if (denta == 0) {
	      double x = -b / (2 * a);
	      
	      System.out.println("nghiem " + x);
	    } else {
	      System.out.println("vo nghiem");
	    }
	}
	public static void uocchungboichung(int a , int b) {
		int gcd = 1;
		int c;
		for(int i = 1; i <= a && i <= b; i++)
	    {
	        if(a %i==0 && b %i==0)
	            gcd = i;
	    }
		c=(a*b)/2;
		 System.out.println("\nuoc chung " + gcd );
		 System.out.println("boi chung " + c );
	}
	public static long GT(int n) {
		long s= 1;
		for(int i = 1 ;i < n ; i++)
			s *=i;
		return s;	
	}
	public static long DQGT(int n) {
		if (n==0) return 1;
		return n*GT(n-1);
	}
	public static long fibo(int k) {
		if(k <= 1)
			return k;
		return fibo(k-1)+fibo(k-2);
	}
	

	public static boolean checkNT(int n) {
        if (n < 2) {
            return false;
        }

        int v = (int) Math.sqrt(n);
        for (int i = 2; i <= v; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
	public static void SNT(int n) {
		for (int i = 1; i < n; i++) {
			if (checkNT(i))
				System.out.println("\n" + i);
		}
	}
	public static void SNT2 (int n) {
		int tmp = 0;
		int count = 0;
		while(count < n) {
			if (checkNT(tmp)) {
				System.out.print(tmp + " ");
				count += 1;
			}
			tmp += 1;
		}
	}
	public static void SNT3() {
		for (int i=10000; i<=99999; i++) {
			if (checkNT(i)) {
				System.out.print(i + "\n");
			}
		}
	}
	public static int tongChuSo(int n) {
		int sum = 0;
		while(n > 0) {
			sum += (n%10);
			n /= 10;
		}
		return sum;
	}
	
	public static int DEC_10 = 10;
	public static boolean isThuanNghich(int n) {
        List<Integer> listNumbers = new ArrayList<>();
        do {
            listNumbers.add(n % DEC_10);
            n = n / DEC_10;
        } while (n > 0);
        int size = listNumbers.size();
        for (int i = 0; i < (size/2); i++) {
            if (listNumbers.get(i) != listNumbers.get(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
	public static boolean checkFibonacci(int n) {
		if (n ==0 || n == 1) return true;
		int f1 = 1;
		int f2 = 0;
		for (int i = 3; i<93; i++) {
			int f = f1 + f2;
			if (f == n) return true;
			f2 = f1;
			f1 = f;
		}
		return false;
	}
	public static void lietKe(int n) {
		System.out.print("So Fibonacci nho hon n va la so nguyen to: ");
		for (int i=0; i<n ;i++) {
			if (checkFibonacci(i) && checkNT(i))
				System.out.print(i + " ");
		}
		System.out.println("\n");
	}
	
	
	
	
	
		
}
	
	
	


