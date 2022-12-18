package Maze;

public class Oyuncu extends Karakter{
    
	public int oyuncuID;
	public String oyuncuAdi;
	public int oyuncuTur;
	public int Skor;
	public int puan;
	
	public Oyuncu() {
		
	}
	
	public int getOyuncuID() {
		return oyuncuID;
	}
	public void setOyuncuID(int oyuncuID) {
		this.oyuncuID = oyuncuID;
	}
	public String getOyuncuAdi() {
		return oyuncuAdi;
	}
	public void setOyuncuAdi(String oyuncuAdi) {
		this.oyuncuAdi = oyuncuAdi;
	}
	public int getOyuncuTur() {
		return oyuncuTur;
	}
	public void setOyuncuTur(int oyuncuTur) {
		this.oyuncuTur = oyuncuTur;
	}
	public int getSkor() {
		return Skor;
	}
	public void setSkor(int skor) {
		Skor = skor;
	}

	public int PuaniGoster() {
		return puan;
	}
	
	
	
	
	
	
	
	
	
}
