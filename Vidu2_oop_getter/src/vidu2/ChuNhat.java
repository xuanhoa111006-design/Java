
public class ChuNhat {
	//Khai bao cac thuoc tinh / du lieu cua lop / truong thong tin
	private double dai;
	private double rong;
	
	// tao ham constructor
	public ChuNhat() {
		dai = 10;
		rong = 5;
	}
	public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    //cach 2
//    public ChuNhat(double daiM, double rongM) {
//        dai = daiM;
//        rong = rongM;
//    }
    // cac getter
    double getDai() {
        return dai;
    }
    double getRong() {
        return rong;
    }
    // cac setter
    void setDai(double daiM) {
        dai = daiM;
    }
    void setRong(double rongM) {
        rong = rongM;
    }
    //cac phuong thuc khac
    public String toString() {
        //tom tat thong tin cua doi tuong
        //thanh 1 chuoi

       String s = "Chu nhat co dai: ";
         s = s + dai;
            s = s + " va chieu rong: " + rong;
        //s = "Chu nhat co dai: " + dai + " va chieu rong: " + rong;
        return s;
    }
    
}
