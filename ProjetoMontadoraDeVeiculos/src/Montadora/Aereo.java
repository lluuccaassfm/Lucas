package Montadora;

/**
 *
 * @author fmendes
 */
public class Aereo extends Automovel{
    
    //atributo
        private String tipo;
    
    //contrutores
        
        public Aereo(String tipo, String nome, String cod, String cor, int ano, int quantidade, double valorFabrica){
        super(nome, cod, cor, ano, quantidade, valorFabrica);
        this.tipo = tipo;
         }

        public Aereo(String tipo, String nome, String cod, int quantidade, double valorFabrica){
            super(nome, cod, quantidade, valorFabrica);
            this.tipo = tipo;
        }
        
    //método get-set

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
        
    //métodos funcionais      
    @Override
    public double lucro(){ //método abstrato sobrecarregado da classe Automovel
      double l=0;  
        if(valorFinal()>= 900000)
            l = 0.2 * valorFinal();
        else
            l = 0.1 * valorFinal();
                    
      return l;
    }
    
    @Override
    public String toString(){
        return String.format("%sTipo: %s\nLucro: R$%.2f\n",super.toString(),tipo,lucro());
    }
}
