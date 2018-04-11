package Montadora;

/**
 *
 * @author fmendes
 */
public enum Funcionarios {
    FUNC1 ("Pac","111-111"),
    FUNC2 ("Lek","222-222"),
    FUNC3 ("Mid","333-333");
    
    private final String nome;
    private final String ra;
    
    private Funcionarios(String nome,String ra){
        this.nome = nome;
        this.ra = ra;
    } 
    
    public String getNome(){
        return this.nome;
    }
    
    public String getRa(){
        return this.ra;
    }
    
    public String ficha(){
        return String.format("Nome: %s\tRA: %s", nome,ra);
    }

}
