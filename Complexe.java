public class Complexe {
    private double Reel;
    private double Imaginaire ;
    public double getReel(){
        return Reel ;
    }
    public void setReel(double Reel){
        this.Reel=Reel;
    }
    public double getImaginaire (){
        return Imaginaire;

    }
    public void setImaginaire (double Imaginaire){
        this.Imaginaire=Imaginaire;
    }
    public Complexe(){
        this.Reel=0;
        this.Imaginaire=0;
    }
    public Complexe(double Reel,double Imaginaire){
        this.Reel=Reel;
        this.Imaginaire=Imaginaire;
    }
    public Complexe plus(Complexe c){
        double Reel=this.Reel +c.Reel;
        double Imaginaire=this.Imaginaire +c.Imaginaire;
        return new Complexe (Reel,Imaginaire);
    }
    public Complexe moins(Complexe c){
        double Reel =this.Reel -c.Reel;
        double Imaginaire=this.Imaginaire -c.Imaginaire;
        return new Complexe (Reel,Imaginaire);

    }
    public void Afficher (){
        System.out.println(Reel+"+"+Imaginaire+"*i");
    }




}
