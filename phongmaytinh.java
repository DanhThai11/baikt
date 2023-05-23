package tuan5;
import java.util.Scanner;
public class phongmaytinh extends phonghoc{
	private int maytinh;
	public phongmaytinh() {
		super();
	}
	public phongmaytinh (String maphong, int daynha, double dientich, int sobongden, int maytinh) {
		super(maphong, daynha, dientich, sobongden);
		this.maytinh = maytinh;
	}
	public int getMaytinh() {
		return maytinh;
	}
	public void setMaytinh(int maytinh) {
		this.maytinh = maytinh;
	}
	
	@Override
	public String toString() {
		return "phong may tinh | maytinh = " + maytinh + " ";
	}
	public static phongmaytinh nhap(String maphong) {
		Scanner sc = new Scanner(System.in);
		phonghoc phong = phonghoc.nhap(maphong);
		System.out.println("Them so may tinh: ");
		int maytinh = sc.nextInt();
		return new phongmaytinh(maphong, phong.getDaynha(), phong.getDientich(), phong.getSobongden(), maytinh);
	}
}
