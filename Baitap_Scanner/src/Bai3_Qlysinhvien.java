import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Bai3_Qlysinhvien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== NHẬP THÔNG TIN SINH VIÊN ===");
        System.out.print("Mã sinh viên: ");
        String id = scanner.nextLine();
        
        System.out.print("Họ tên: ");
        String name = scanner.nextLine();
        
        System.out.print("Điểm Toán: ");
        double math = scanner.nextDouble();
        
        System.out.print("Điểm Lý: ");
        double physics = scanner.nextDouble();
        
        System.out.print("Điểm Hóa: ");
        double chemistry = scanner.nextDouble();
        
        double average = (math + physics + chemistry) / 3;
	}

}
