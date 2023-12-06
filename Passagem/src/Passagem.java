import java.util.Scanner;

public class Passagem {
    private String NomePassageiro;
    private String Telefone;
    private String RG;
    private String LocalViagem;
    private String Data;
    private String Horario;
    private String NumPoltrona;

    public String getNomePassageiro() {
        return NomePassageiro;
    }

    public void setNomePassageiro(String NomePassageiro) {
        this.NomePassageiro = NomePassageiro;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }

    public String getLocalViagem() {
        return LocalViagem;
    }

    public void setLocalViagem(String LocalViagem) {
        this.LocalViagem = LocalViagem;
    }

    public String getData() {
        return Data;
    }

    public void setData(String Data) {
        this.Data = Data;
    }

    public String getHorario() {
        return Horario;
    }

    public void setHorario(String Horario) {
        this.Horario = Horario;
    }

    public String getNumPoltrona() {
        return NumPoltrona;
    }

    public void setNumPoltrona(String NumPoltrona) {
        this.NumPoltrona = NumPoltrona;
    }
    
    //Passageiro
    public void CadastrarPassageiro(){
        Scanner um;
        um = new Scanner (System.in);
        System.out.println("Nome:");
        setNomePassageiro(um.next());
        System.out.println("Telefone:");
        setTelefone(um.next());
        System.out.println("RG:");
        setRG(um.next());
    }
    
    //Passagem
    public void CadastrarPassagem (){
    Scanner um;
    um = new Scanner (System.in);
       System.out.println("LocalViagem:");
       setLocalViagem(um.next());
       System.out.println("Data:");
       setData(um.next());
       System.out.println("Horario:");
       setHorario(um.next());
       System.out.println("Numero da Poltrona:");
       setNumPoltrona(um.next());
    }
    
    public void MostrarDadosPassageiro(){
    System.out.println("\nNome:" +this.NomePassageiro +"\nTelefone:" + this.Telefone+ "\nRG:" +this.RG);
    }
    
    public void MostrarPassagem(){
    System.out.println("\nLocal da Viagem:" +this.LocalViagem +"\nData:" + this.Data+ "\nHorario:" +this.Horario + ("Numero da Poltrona:" +this.NumPoltrona));
    }
    
 
}

