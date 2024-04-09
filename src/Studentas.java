import java.util.ArrayList;
import java.util.Comparator;

public class Studentas {
    private String vardas, pavarde, studentoId;
    private ArrayList<Integer> pazymiai = new ArrayList<Integer>();

    Studentas(String vardas, String pavarde, String studentoId){
        this.vardas = vardas;
        this.pavarde = pavarde;
        this.studentoId = studentoId;
    }


    public void setVardas(String vardas) {
        this.vardas = vardas;
    }

    public void setPavarde(String pavarde) {
        this.pavarde = pavarde;
    }

    public void setStudentoId(String studentoId) {
        this.studentoId = studentoId;
    }

    public void setPazymiai(ArrayList<Integer> pazymiai) {
        this.pazymiai = pazymiai;
    }

    public String getVardas() {
        return vardas;
    }

    public String getPavarde() {
        return pavarde;
    }

    public String getStudentoId() {
        return studentoId;
    }

    public ArrayList<Integer> getPazymiai() {
        return pazymiai;
    }

    public void pridetiPazymius(Integer pazymys){
        pazymiai.add(pazymys);
    }
    public void pridetiPazymius(ArrayList<Integer> pazymys){
        pazymiai.addAll(pazymys);
    }

    public double pasVidurki(){
        int suma = 0;
        for(Integer i : pazymiai) suma+=i;
        return (double) suma / pazymiai.size();
    }

    public double pasMediana(){
        pazymiai.sort(Comparator.naturalOrder());
        if(pazymiai.size() / 2 != 0) return pazymiai.get(pazymiai.size() / 2);
        else return (double) ( pazymiai.get(pazymiai.size() / 2 - 1 ) + pazymiai.get(pazymiai.size() / 2 ) ) / 2;
    }

    public int didPaz(){
        int x = pazymiai.getFirst();
        for(int i = 1; i<pazymiai.size(); i++){
            if(x < pazymiai.get(i)) x = pazymiai.get(i);
        }
        return x;
    }
    public int mazPaz(){
        int x = pazymiai.getFirst();
        for(int i = 1; i<pazymiai.size(); i++){
            if(x > pazymiai.get(i)) x = pazymiai.get(i);
        }
        return x;
    }

    public int pazymiuKiekis(){
        return pazymiai.size();
    }


}
