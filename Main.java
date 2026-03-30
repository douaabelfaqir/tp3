public class Main {
    public static void main(String[] args) {


        Complexe z1 = new Complexe(3, 2);   // 3 + 2i
        Complexe z2 = new Complexe(1, 4);   // 1 + 4i


        System.out.print("z1 = ");
        z1.afficher();

        System.out.print("z2 = ");
        z2.afficher();

        Complexe z3 = z1.plus(z2);
        System.out.print("z1 + z2 = ");
        z3.afficher();

        Complexe z4 = z1.moins(z2);
        System.out.print("z1 - z2 = ");
        z4.afficher();
    }
}