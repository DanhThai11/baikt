package tuan5;
import java.util.Scanner;
public class phongthinghiem extends phonghoc{
	private String chuyennganh;
	private int succhua;
	private boolean bonrua;
	public phongthinghiem() {
		super();
	}
	public phongthinghiem (String maphong, int daynha, double dientich, int sobongden, String chuyennganh, int succhua, boolean bonrua) {
		super(maphong, daynha, dientich, sobongden);
		this.chuyennganh = chuyennganh;
		this.succhua = succhua;
		this.bonrua = bonrua;
	}
	public String getChuyennganh() {
		return chuyennganh;
	}
	public void setChuyennganh(String chuyennganh) {
		this.chuyennganh = chuyennganh;
	}
	public int getSucchua() {
		return succhua;
	}
	public void setSucchua(int succhua) {
		this.succhua = succhua;
	}
	public boolean isBonrua() {
		return bonrua;
	}
	public void setBonrua(boolean bonrua) {
		this.bonrua = bonrua;
	}
	
	@Override
	public String toString() {
		return "phong thi nghiem | chuyen nganh = " + chuyennganh + "| suc chua = " + succhua + "| bon rua = " + bonrua + " ";
	}
	public static phongthinghiem nhap(String maphong) {
		Scanner sc = new Scanner(System.in);
		phonghoc phong = phonghoc.nhap(maphong);
		System.out.println("Them chuyen nganh: ");
		String chuyennganh = sc.nextLine();
		System.out.println("Them suc chua: ");
		int succhua = sc.nextInt();
		System.out.println("Co bon rua ?");
		boolean bonrua = sc.nextBoolean();
		return new phongthinghiem(maphong, phong.getDaynha(), phong.getDientich(), phong.getSobongden(), chuyennganh, succhua, bonrua);
	}
}
