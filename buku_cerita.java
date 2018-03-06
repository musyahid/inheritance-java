package buku;

public class buku_cerita extends buku {
	String kategori;
	
	@Override
	String judul() {
		System.out.println("Judul : " + judul);
		return judul;
	}
	@Override
	String nama_pengarang() {
		System.out.println("Nama Pengarang : " + nama_pengarang);
		return nama_pengarang;
	}
	@Override
	String penerbit() {
		System.out.println("Nama Penerbit : " + penerbit);
		return penerbit;
	}
	@Override
	String tahun_terbit() {
		System.out.println("tahun terbit : " + tahun_terbit);
		return tahun_terbit;
	}
	@Override
	String harga() {
		System.out.println("Harga : " + harga);
		return harga;
	}
	String kategori() {
		System.out.println("Kategori : " + kategori);
		return kategori;
	}
}
