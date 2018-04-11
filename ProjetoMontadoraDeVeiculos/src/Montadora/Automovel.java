package Montadora;

import java.text.DecimalFormat;


/**
 *
 * @author fmendes
 */
public abstract class Automovel implements Preço{
   //atributos
    private String nome;
    private final String COD; 
    private String cor;
    private int ano;
    private int qtd;
    private double valorFabrica;
    private static String nomeEmpresa;
    private static int tel;
    public static int cont =0;
       
    DecimalFormat df = new DecimalFormat("R$ ###,###,000.00");
    
    //construtores
        public Automovel(String nome, String cod, String cor, int ano, int quantidade, double valorFabrica){
        this.nome = nome;
        this.COD = cod;
        this.cor = cor;
        this.ano = ano;
        this.qtd = quantidade;
        this.valorFabrica = valorFabrica;
        
        cont ++;
        
        }
        
        public Automovel(String nome,String cod, int quantidade, double valorFabrica){
            this.nome = nome;
            this.COD = cod;
            this.qtd = quantidade;
            this.valorFabrica = valorFabrica;
            
        cont ++;
        }
        
    //métodos get-set
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCod() {
        return COD;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    

    public double getValorFabrica() {
        return valorFabrica;
    }

    public void setValorFabrica(double valorFabrica) {
        this.valorFabrica = valorFabrica;
    }

    public static String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public static void setNomeEmpresa(String nomeEmpresa) {
        Automovel.nomeEmpresa = nomeEmpresa;
    }

    public static int getTel() {
        return tel;
    }

    public static void setTel(int tel) {
        Automovel.tel = tel;
    }

    public static int getCont() {
        return cont;
    }   
    
    //métodos funcionais
    @Override
    public double valorFinal(){ //método sobrecarregado da classe Interface - Preço
        return qtd * valorFabrica;
    }   
    @Override
    public String toString(){
        return String.format("\n--- Empresa ---\nNome: %s\nTelefone: %d\n--- Automóvel ---\nNome: %s\nCódigo: %s\nCor: %s\nAno: %d\nQuantidade: %d\nValor (Fábrica): %s\nValor Final: %s\n",
                             nomeEmpresa,tel,nome,COD,cor,ano,qtd,df.format(valorFabrica),df.format(valorFinal()));
    }
    public abstract double lucro(); //método abstrato que calculará os lucros da venda
    
    public double aumento(double porc){
        return (porc*valorFabrica) + valorFabrica; 
   }
}
