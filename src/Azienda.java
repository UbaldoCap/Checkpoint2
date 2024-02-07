import java.util.ArrayList;

public class Azienda {
    private String nome;
    private final ArrayList<Dipendente> dipendenteArrayList;

    public Azienda(String nome) {
        this.nome = nome;
        this.dipendenteArrayList = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Dipendente> getDipendenteArrayList() {
        return dipendenteArrayList;
    }

    public void addDipendente(Dipendente dipendente) {
        dipendenteArrayList.add(dipendente);
    }

    public void removeDipendente(Dipendente dipendente) {
        dipendenteArrayList.remove(dipendente);
    }

    public void visualizzaDipendenti() {
        for (Dipendente dipendente : dipendenteArrayList) {
            dipendente.stampaInfo();
        }
    }

    public Double salarioTotale() {
        Double sum = 0.0;
        for (Dipendente dipendente : dipendenteArrayList) {
            sum += dipendente.getSalario();
        }
        return sum;
    }

    public void aumentoSalario (Double aumento) {
        for (Dipendente dipendente : dipendenteArrayList) {
            dipendente.setSalario(dipendente.getSalario() + aumento);
        }
    }
}
