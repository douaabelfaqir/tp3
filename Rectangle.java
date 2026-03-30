public class Rectangle {public class Rectangle{
    public double Longueur;
    public double Largeur;
    public double getLongueur() {
        return Longueur;
    }

    public void setLongueur(double Longueur) {
        this.Longueur = Longueur;
    }

    public double getLargeur() {
        return Largeur;
    }

    public void setLargeur(double largeur) {
        this.Largeur = Largeur;
    }
    public Rectangle(double Longueur, double Largeur) {
        this.Longueur = Longueur;
        this.Largeur = Largeur;
    }
    public double perimetre() {
        return 2 * (Longueur + Largeur);

    }
    public double air(){
        return Longueur*Largeur;

    }
    public boolean estcarre(){
        return Longueur=Largeur;
    }
    public void afficherrectangle(){
        System.out.println("La longueur du rectangle est:"+Longueur+
                "largeur:"+Largeur+
                "Son perimetre:"+perimetre()+
                "son air:"+air()+
                "_"+estcarre()+? "Il s’agit d’un carré" : "Il ne s’agit pas d’un carré");
    }
}
}
