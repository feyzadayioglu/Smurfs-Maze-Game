package Maze;

public abstract class Düsman extends Karakter{
	int dusmanID;
    String dusmanAdi;
    String dusmanTur;
    
   public Düsman(String dusmanAdi,String dusmanTur,int dusmanID){
   this.dusmanAdi=dusmanAdi;
   this.dusmanTur=dusmanTur;
   this.dusmanID=dusmanID;
   
   
   }
          public int getDusmanID() {
       return dusmanID;
   }
   
   public void setDusmanID(int dusmanID) {
       this.dusmanID = dusmanID;
   }
  
   public String getDusmanAdi() {
       return dusmanAdi;
   }
 
   public void setDusmanAdi(String dusmanAdi) {
       this.dusmanAdi = dusmanAdi;
   }
       public String getDusmanTur() {
       return dusmanTur;
   }
 
   public void setDusmanTur(String dusmanTur) {
       this.dusmanTur = dusmanTur;
   }
	

}
