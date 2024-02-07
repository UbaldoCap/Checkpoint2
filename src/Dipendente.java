public class Dipendente {
    private Integer id;
    private String nome;
    private String cognome;
    private Double salario;
    private String reparto;

    public Dipendente(Integer id, String nome, String cognome, Double salario, String reparto) {
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;
        this.salario = salario;
        this.reparto = reparto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getReparto() {
        return reparto;
    }

    public void setReparto(String reparto) {
        this.reparto = reparto;
    }

    public void stampaInfo() {
        System.out.println("ID: " + id + " nome: " + nome +
                " codnome: " + cognome + " salario: " + salario +
                " reparto: " + reparto);
    }
}
