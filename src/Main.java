import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendente1 = new Dipendente(3, "marco", "rossi", 1200.00, "vendite");
        Dipendente dipendente2 = new Dipendente(6, "mario", "bianchi", 1500.00, "vendite");
        Azienda azienda = new Azienda("dev");
        azienda.addDipendente(dipendente1);
        azienda.addDipendente(dipendente2);
        azienda.visualizzaDipendenti();
        System.out.println(azienda.salarioTotale());
        azienda.aumentoSalario(1000.00);
        azienda.visualizzaDipendenti();
        HashMap<Dipendente, Azienda> aziendaHashMap = new HashMap<>();
        for (Dipendente dipendente : azienda.getDipendenteArrayList()) {
            aziendaHashMap.put(dipendente, azienda);
        }

        System.out.println(" ");
        for (Map.Entry<Dipendente, Azienda> entry : aziendaHashMap.entrySet()) {
            entry.getKey().stampaInfo();
            System.out.println(entry.getValue().getNome());
        }
    }
}
