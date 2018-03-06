package buku;

public class main {
	public static void main(String[] args) {
		
		buku books = new buku();
		
		buku_pbo pbo = new buku_pbo();
		pbo.judul = "Buku Pemrograman Berorientaso Objek";
		pbo.nama_pengarang = "Kurniawaan";
		pbo.penerbit = "Airlangga";
		pbo.tahun_terbit = "2017";
		pbo.harga = "Rp 200.000";
		pbo.jumlah_hal = "100";
		
		buku_pbd pbd = new buku_pbd();
		pbd.judul = "Perancangan Basis Data";
		pbd.nama_pengarang = "Wahyu";
		pbd.penerbit = "Gramedia";
		pbd.tahun_terbit = "2010";
		pbd.harga = "Rp 800.000";
		pbd.tebal = "100";
		
		buku_cerita cerita = new buku_cerita();
		cerita.judul = "Si Kancil";
		cerita.nama_pengarang = "Budiman";
		cerita.penerbit = "Gramedia";
		cerita.tahun_terbit = "2002";
		cerita.harga = "Rp 3.000";
		cerita.kategori = "anak - anak";
		
		buku_masak masak = new buku_masak();
		masak.judul = "Masakan rumah";
		masak.nama_pengarang = "selfi";
		masak.penerbit = "Gramedia";
		masak.tahun_terbit = "2002";
		masak.harga = "Rp 40.000";
		masak.menu = "Masakan rumahan, masakan daerah, dll";
		
		System.out.println("---------Buku Pemrograman Berorientasi Objek------------");
		
		pbo.judul();
		pbo.penerbit();
		pbo.nama_pengarang();
		pbo.tahun_terbit();
		pbo.harga();
		pbo.jumlah_hal();
		
		System.out.println("----------Buku Perancangan Basis Data------------");
		
		pbd.judul();
		pbd.penerbit();
		pbd.nama_pengarang();
		pbd.tahun_terbit();
		pbd.harga();
		pbd.tebal();

		System.out.println("-----Buku Cerita-----------");
		
		cerita.judul();
		cerita.penerbit();
		cerita.nama_pengarang();
		cerita.tahun_terbit();
		cerita.harga();
		cerita.kategori();
		
		System.out.println("-----------Buku Masak--------------");
		
		masak.judul();
		masak.penerbit();
		masak.nama_pengarang();
		masak.tahun_terbit();
		masak.harga();
		masak.menu();
	}
}
