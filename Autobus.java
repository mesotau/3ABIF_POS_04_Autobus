public class Autobus{
    
    private String kennzeichen;
    private int sitzplätze;
    private boolean anhänger;
    
    //Getter
    
    public String getKennzeichen(){
        
        return kennzeichen;
    }
    
    public int getSitzplätze(){
        
        return sitzplätze;
    }
    
    public boolean getAnhänger(){
        
        return anhänger;
    }
    
    //Setter
    
    public void setKennzeichen(String neuKennzeichen){
        
        kennzeichen = neuKennzeichen;
    }
    
    public void setSitzplätze(int neuSitzplätze){
    
        sitzplätze = neuSitzplätze;
    }
    
    public void setAnhänger(boolean neuAnhänger){
    
        anhänger = neuAnhänger;
    }
}