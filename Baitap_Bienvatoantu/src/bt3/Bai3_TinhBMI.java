package bt3;

public class Bai3_TinhBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double weight = 65.5;    
        double height = 1.70;    
        
        double bmi = weight / (height * height);
        // In dữ liệu chiều cao cân nặng
        System.out.println("Cân nặng: " + weight + " kg");
        System.out.println("Chiều cao: " + height + " m");
        System.out.println("Chỉ số BMI: " + bmi);
	}

}
