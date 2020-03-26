package controlealunos;

public class Alunos {
    private String nome;
    private String matricula;
    private String telelfone;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getTelelfone() {
        return telelfone;
    }

    public void setTelelfone(String telelfone) {
        this.telelfone = telelfone;
    }
    public String getDados(){
        return "NOME: "+ this.nome+
                "\nMATRICULA: "+this.matricula+
                 "\nTELEFONE: "+this.telelfone+
                    "\n";
        
    }
}
