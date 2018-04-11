package Montadora;

/**
 *
 * @author fmendes
 */
public class Terrestre extends Automovel{
   //atributo 
    private char categoria;
  
   //contrutores
    public Terrestre(char categoria, String nome, String cod, String cor, int ano, int quantidade, double valorFabrica) {
        super(nome, cod, cor, ano, quantidade, valorFabrica);
        this.categoria = categoria;
    }

    public Terrestre(char categoria, String nome, String cod,int quantidade, double valorFabrica) {
        super(nome, cod, quantidade, valorFabrica);
        this.categoria = categoria;
    }
    
    
   //método get - set
    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }
    
   //métodos funcionais
     @Override
    public double lucro(){ //método abstrato sobrecarregado da classe Automovel
      double l=0;  
        if(valorFinal()>= 100000)
            l = 0.2 * valorFinal();
        else
            l = 0.1 * valorFinal();
                    
      return l;
    } 
     @Override
    public String toString(){
        return String.format("%sCategoria: %s\nLucro(venda): R$%.2f",super.toString(),categoria,lucro());
    }
    
}
