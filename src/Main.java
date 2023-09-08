import ingredienser.ingredienser;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        int antalPersoner = keyboard.nextInt();

        System.out.println("Banan pandekag er:");
        ingredienser æg = new ingredienser("Æg", 3, "styk", 2, 274, 62);
        ingredienser mel = new ingredienser("Mel", 100, "gram", 2, 364, 1);
        ingredienser banan = new ingredienser("Banan", 2, "styk", 2, 177.4, 105);
        ingredienser salt = new ingredienser("Salt", 1, "tsk", 2, 0, 6);
        ingredienser smør = new ingredienser("Smør", 1, "spsk", 2, 7.16, 14);
        ingredienser havregryn = new ingredienser("Havregryn", 100, "gram", 2, 369, 1);


        System.out.println(" ingredienser " + æg.getType() + ", " + æg.getMængde() + ", " + æg.getEnhed() + ", "
                + æg.getOprindeligAntal() + ", " + æg.getKcal() + ", " + æg.getVægtPrEnhed());
        System.out.println(" ingredienser " + mel.getType() + ", " + mel.getMængde() + ", " + mel.getEnhed() + ", "
                + mel.getOprindeligAntal() + ", " + mel.getKcal() + ", " + mel.getVægtPrEnhed());
        System.out.println(" ingredienser " + banan.getType() + ", " + banan.getMængde() + ", " + mel.getEnhed() + ", "
                + banan.getOprindeligAntal() + ", " + banan.getKcal() + ", " + banan.getVægtPrEnhed());
        System.out.println(" ingredienser " + salt.getType() + ", " + salt.getMængde() + ", " + salt.getEnhed() + ", "
                + salt.getOprindeligAntal() + ", " + salt.getKcal() + ", " + salt.getVægtPrEnhed());
        System.out.println(" ingredienser " + smør.getType() + ", " + smør.getMængde() + ", " + smør.getEnhed() + ", "
                + smør.getOprindeligAntal() + ", " + smør.getKcal() + ", " + smør.getVægtPrEnhed());
        System.out.println(" ingredienser " + havregryn.getType() + ", " + havregryn.getMængde() + ", " + havregryn.getEnhed() + ", "
                + havregryn.getOprindeligAntal() + ", " + havregryn.getKcal() + ", " + havregryn.getVægtPrEnhed());

        System.out.println("vægten af æg: " + æg.vægtenAfIngredienser());
        System.out.println("vægten af mel: " + mel.vægtenAfIngredienser());
        System.out.println("vægten af banan: " + banan.vægtenAfIngredienser());
        System.out.println("vægten af salt: " + salt.vægtenAfIngredienser());
        System.out.println("vægten af smør: " + smør.vægtenAfIngredienser());
        System.out.println("vægten af havregryn: " + havregryn.vægtenAfIngredienser());

        System.out.println("Samlet mængde energiindhold: " + smør.getKcal() + æg.getKcal() + havregryn.getKcal() + salt.getKcal() + banan.getKcal() + mel.getKcal());

        // mangler keyboard int antal = keyboard.nextInt();


      }
}
