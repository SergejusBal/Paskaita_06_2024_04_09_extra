import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");

        Studentas stud1 = new Studentas("Jonas", "Jonaitis","524515421");
        Studentas stud2 = new Studentas("Petras", "Petraitis","454515421");

        stud1.pridetiPazymius(4);
        stud1.pridetiPazymius(5);
        stud1.pridetiPazymius(6);
      //  stud1.pridetiPazymius(7);
        stud1.pridetiPazymius(8);
        stud1.pridetiPazymius(9);

        System.out.println(stud1.getVardas() + " " + stud1.getPavarde() + " " + stud1.getStudentoId() + " Pazymiai: ");
        System.out.println(stud1.getPazymiai());
        System.out.println("Pazymiu vidurkis: " + stud1.pasVidurki());
        System.out.println("Pazymiu mediana: " + stud1.pasMediana());
        System.out.println("Didziausia pazymys: " + stud1.didPaz());
        System.out.println("Maziausias pazymys: " + stud1.mazPaz());
        System.out.println("Pazymiu kiekis: " + stud1.pazymiuKiekis());


        System.out.println();
        System.out.println();
        stud2.pridetiPazymius(sukurtiPazymiuLista(50));

        System.out.println(stud1.getVardas() + " " + stud2.getPavarde() + " " + stud2.getStudentoId() + " Pazymiai: ");
        System.out.println(stud2.getPazymiai());
        System.out.println("Pazymiu vidurkis: " + stud2.pasVidurki());
        System.out.println("Pazymiu mediana: " + stud2.pasMediana());
        System.out.println("Didziausia pazymys: " + stud2.didPaz());
        System.out.println("Maziausias pazymys: " + stud2.mazPaz());
        System.out.println("Pazymiu kiekis: " + stud2.pazymiuKiekis());






    }

    public static ArrayList<Integer> sukurtiPazymiuLista(int x){
        Random random = new Random();
        ArrayList<Integer> pazymiai = new ArrayList<Integer>();

        for(int i = 0; i < x; i++){
            pazymiai.add(random.nextInt(0,10));
        }
        return pazymiai;
    }


}