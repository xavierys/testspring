package essai;

public class Montre {
    private Integer heure;
    private Integer minute;
    
    public Montre(Integer heure, Integer minute) {
	super();
	this.heure = heure;
	this.minute = minute;    
    }

    
    
    @Override
    public String toString() {
	return "Montre [heure=" + heure + ", minute=" + minute + "]";
    }



    public String afficheHeure() {
	return this.heure+":"+this.minute;
    }

    
    
}
