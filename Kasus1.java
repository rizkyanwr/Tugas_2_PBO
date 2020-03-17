public class Kasus1{
	String nama, stb, jurusan, fakultas;

	public Kasus1()
	{
		nama ="Rizky Dwi Amalia";
		stb ="13020180138";
		jurusan ="Teknik Informatika";
		fakultas ="Ilmu Komputer";
	}

	public static void main(String[] args)
	{
		Kasus1 biodata = new Kasus1();

		System.out.println("Nama      : " +(biodata.nama));
		System.out.println("Stb	  : " +(biodata.stb));
		System.out.println("Jurusan   : " +(biodata.jurusan));
		System.out.println("Fakultas  : " +(biodata.fakultas));
	}
}