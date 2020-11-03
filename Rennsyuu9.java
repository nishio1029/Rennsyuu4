//配列
public class Rennsyuu9 {
	public static void main(String[] args) {
		int sansu = 20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;

		int sum = sansu + kokugo + rika + syakai + eigo;

		int avg = sum / 5;
		System.out.println("合計点:" + sum);
		System.out.println("平均点:" + avg);
	}
}
/*配列とは同一種類の複数のデータを並び順で格納するデータ構造です
箱が連続してならんでます、その箱の一つを要素といいます
同一種類のデータしか格納できない*/