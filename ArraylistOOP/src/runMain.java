        import java.util.ArrayList;
		import java.util.Scanner;

public class runMain {

	public static void main(String[] args) {
		
	
		        ArrayList<Integer> dssonguyen = new ArrayList<Integer>();
		        Scanner banphim = new Scanner(System.in);

		        for(int i = 0 ; i< 10; i++){
		            System.out.print("Moi ban nhap phan tu thu " + i + ": ");
		            Integer tam = banphim.nextInt();
		            dssonguyen.add(tam);
//
		        }

		        System.out.print("Danh sach so nguyen la: ");
		        for ( Integer x : dssonguyen){
		            System.out.print(x + " ");
		        }

		        int tam = 0;
		        for ( Integer x : dssonguyen){
		            if( x % 2 == 0 ) {
		                tam++;
		            }
		        }
		        System.out.println("\n");
		        System.out.println("Co " + tam + " so chan trong mang ");

		        int temp = 0;
		        for ( Integer x : dssonguyen){
		            temp += x;
		        }
				//
		        System.out.println("Tong cac phan tu trong mang la: " + temp + " ");
		    }

	}



