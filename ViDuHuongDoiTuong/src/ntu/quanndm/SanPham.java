package ntu.quanndm;

public class SanPham {
	// Dinh nghia cac thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // Ten file anh
	// Ham tao
	public SanPham() {
		// Khoi tao gia tri ban dau cho cac thuoc tinh neu co o day
	}
	
	public SanPham(int _maSP, String _tenSP, String _loaiSP, String _anhSP) {
		// Khoi tao gia tri ban dau cho cac thuoc tinh neu co o day
		maSP = _maSP;
		tenSP = _tenSP;
		loaiSP = _loaiSP;
		anhSP = _anhSP;
	}
}
