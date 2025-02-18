package ntu.quanndm;

public class SanPham {
	// Dinh nghia cac thuoc tinh
	int maSP;
	String tenSP;
	String loaiSP;
	String anhSP; // Ten file anh
	public SanPham() {
		super();
	}
	public SanPham(int maSP, String tenSP, String loaiSP, String anhSP) {
		super();
		this.maSP = maSP;
		this.tenSP = tenSP;
		this.loaiSP = loaiSP;
		this.anhSP = anhSP;
	}
	public int getMaSP() {
		return maSP;
	}
	public void setMaSP(int maSP) {
		this.maSP = maSP;
	}
	public String getTenSP() {
		return tenSP;
	}
	public void setTenSP(String tenSP) {
		this.tenSP = tenSP;
	}
	public String getLoaiSP() {
		return loaiSP;
	}
	public void setLoaiSP(String loaiSP) {
		this.loaiSP = loaiSP;
	}
	public String getAnhSP() {
		return anhSP;
	}
	public void setAnhSP(String anhSP) {
		this.anhSP = anhSP;
	}
	@Override
	public String toString() {
		return "[Ma SP=" + maSP + ", Ten SP=" + tenSP + ", Loai SP=" + loaiSP + "]";
	}
}
