package ingredienser;

public class ingredienser {
    private String type;
    private double mængde;
    private String enhed;
    private int oprindeligAntal;
    private double kcal;
    private double vægtPrEnhed;
    private int antal;

    //Konstruktør
    public ingredienser(String type, double mængde, String enhed, int oprindeligAntal, double kcal) {
        this.type = type;
        this.mængde = mængde;
        this.enhed = enhed;
        this.oprindeligAntal = oprindeligAntal;
        this.kcal = kcal;
        this.vægtPrEnhed = 1;
    }
    public ingredienser(String type, double mængde, String enhed, int oprindeligAntal, double kcal, double vægtPrEnhed) {
        this.type = type;
        this.mængde = mængde;
        this.enhed = enhed;
        this.oprindeligAntal = oprindeligAntal;
        this.kcal = kcal;
        this.vægtPrEnhed = vægtPrEnhed;
    }

    public String getType() {
        return type;
    }

    public double getMængde() {
        return mængde;
    }

    public String getEnhed() {
        return enhed;

    }

    public int getOprindeligAntal(){
        return oprindeligAntal;
    }
    public double getVægtPrEnhed(){
        return vægtPrEnhed;
    }

    public double getKcal(){
        return kcal;
    }

    public void setType(String t) {
        this.type = t;
    }

    public void setMængde(double m) {
        this.mængde = m;
    }

    public void setEnhed(String e) {
        this.enhed = e;
    }


    public double vægtenAfIngredienser(){
        return vægtPrEnhed * mængde;
    }
    // Service metode

    public double kcalTilEnergiIndhold(){
        return kcal * 4.2; //(antal/oprindeligAntal)
    }



}
