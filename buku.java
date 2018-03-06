package buku;

public class buku {
	String judul;
	String nama_pengarang;
	String penerbit;
	String tahun_terbit;
	String harga;
	
	String judul() {
		System.out.print("ini judul buku");
		return judul;
	}
	String nama_pengarang() {
		System.out.print("nama pengarang");
		return nama_pengarang;
	}
	String penerbit() {
		System.out.print("nama penerbit");
		return penerbit;
	}
	String tahun_terbit() {
		System.out.print("tahun terbit");
		return tahun_terbit;
	}
	String harga() {
		System.out.print("harga");
		return harga;
	}
}
