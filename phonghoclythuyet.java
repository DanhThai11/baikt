package tuan5;
import java.util.Scanner;
public class phonghoclythuyet extends phonghoc{
	private boolean maychieu;
	public phonghoclythuyet() {
		super();
	}
	public phonghoclythuyet (String maphong, int daynha, double dientich, int sobongden, boolean maychieu) {
		super(maphong, daynha, dientich, sobongden);
		this.maychieu = maychieu;
	}
	public void setMaychieu(boolean maychieu) {
		this.maychieu = maychieu;
	}
	
	@Override
	public String toString() {
		return "phong hoc ly thuyet | maychieu = " + maychieu + " ";
	}
	@Override
	public boolean datchuan() {
		return this.maychieu && super.datchuan();
	}
	public static phonghoclythuyet nhap(String maphong) {
		Scanner sc = new Scanner(System.in);
		phonghoc phong = phonghoc.nhap(maphong);
		System.out.println("Co may chieu ?");
		boolean maychieu = sc.nextBoolean();
		return new phonghoclythuyet(maphong, phong.getDaynha(), phong.getDientich(), phong.getSobongden(), maychieu);
	}
}
