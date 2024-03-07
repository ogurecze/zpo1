public class Pracownik {
    private Pracowac pracowac;
    private Dojezdzac dojezdzacl;
    private SpedzanieWolnegoCzasu spedzanieWolnegoCzasu;
    private String zawod;

    Pracownik(String zawod){
        this.zawod = zawod;
    }

    public Pracowac getPracowac() {
        return pracowac;
    }

    public void setPracowac(Pracowac pracowac) {
        this.pracowac = pracowac;
    }

    public Dojezdzac getDojezdzacl() {
        return dojezdzacl;
    }

    public void setDojezdzacl(Dojezdzac dojezdzacl) {
        this.dojezdzacl = dojezdzacl;
    }

    public SpedzanieWolnegoCzasu getSpedzanieWolnegoCzasu() {
        return spedzanieWolnegoCzasu;
    }

    public void setSpedzanieWolnegoCzasu(SpedzanieWolnegoCzasu spedzanieWolnegoCzasu) {
        this.spedzanieWolnegoCzasu = spedzanieWolnegoCzasu;
    }

    public void jakPracuj(){
        this.pracowac.pracuj();
    }
    public void jakDojezdzac(){
        this.dojezdzacl.dojezdzaj();
    }
    public void jakSpedzacWolnyCzas(){
        this.spedzanieWolnegoCzasu.spedzajWolnyCzas();
    }
}
