public class Autobus{
    
    private String kennzeichen;
    private int sitzplätze;
    private boolean anhänger;
    
    //Konstruktoren
    
    //Konstruktor01:
    
    public Autobus(String neuKennzeichen, int neuSitzplätze, boolean neuAnhänger){
    
        setKennzeichen(neuKennzeichen);
        setSitzplätze(neuSitzplätze);
        setAnhänger(neuAnhänger);
    }
    
    //Konstruktor02:
    
    public Autobus(){
    
        setKennzeichen("W-1234A");
        setSitzplätze(29);
        setAnhänger(false);
    }
    
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