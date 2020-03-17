// RIZKY DWI AMALIA - 13020180138 (B2)


public class Kasus2{
	int totalDetik, detikSekarang, totalMenit, menitSekarang, totalJam, jamSekarang;

	public Kasus2(){
		totalDetik = 1203183086;
		detikSekarang = totalDetik%60;
		totalMenit = totalDetik/60;
		menitSekarang = totalMenit%60;
		totalJam = totalMenit/60;
		jamSekarang = totalJam%24;
	}
	
	public static void main(String[] args)
	{
	Kasus2 waktu = new Kasus2();

	System.out.println((waktu.jamSekarang)+" Jam : "+(waktu.menitSekarang)+" Menit : "+(waktu.detikSekarang)+" Detik");
	}
}  