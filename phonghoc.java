package tuan5;
import java.util.Scanner;
public class phonghoc {
	private String maphong;
	private int daynha;
	private double dientich;
	private int sobongden;
	public phonghoc() {
		super();
	}
	public phonghoc(String maphong, int daynha, double dientich, int sobongden) {
		this.maphong = maphong;
		this.daynha = daynha;
		this.dientich = dientich;
		this.sobongden = sobongden;
	}
	@Override
	public String toString() {
		return "phong hoc | ma phong = " + maphong + "| day nha = " + daynha + "| dien tich = " + dientich + "| so bong den = "
				+ sobongden + " ";
	}
	public String getMaphong() {
		return maphong;
	}
	public void setMaphong(String maphong) {
		this.maphong = maphong;
	}
	public int getDaynha() {
		return daynha;
	}
	public void setDaynha(int daynha) {
		this.daynha = daynha;
	}
	public double getDientich() {
		return dientich;
	}
	public void setDientich(double dientich) {
		this.dientich = dientich;
	}
	public int getSobongden() {
		return sobongden;
	}
	public void setSobongden(int sobongden) {
		this.sobongden = sobongden;
	}
	public static phonghoc nhap(String maphong) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Them day nha: ");
		int daynha = sc.nextInt();
		System.out.println("Them dien tich: ");
		double dientich = sc.nextDouble();
		System.out.println("Them so bong den: ");
		int sobongden = sc.nextInt();
		return new phonghoc(maphong, daynha, dientich, sobongden);
	}
	public boolean datchuan() {
		return (this.dientich / this.daynha) >=10;
	}
}
