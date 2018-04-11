
package Montadora;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Random;

/**
 *
 * @author to aki e vcs?
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 * Bora carlos
 *  
 */
public class Test3 {
    public static void main(String[] args) {
        
               
        Calendar cal = Calendar.getInstance();
        int dia = cal.get(Calendar.DATE);
        int mes = cal.get(Calendar.MONTH);
        int ano = cal.get(Calendar.YEAR);
        
        System.out.println("Processo Realizado dia: "+dia+"/"+mes+"/"+ano);
        
        
        //métodos static - atribuição de valores
        Terrestre.setNomeEmpresa("Rey Veiculos");
        Aereo.setTel(777007);
        
        //objetos
        Aereo a1 = new Aereo("Avião","Jato Black", "JT-111",DefineCor(),2010,2,500000);
        Aereo a2 = new Aereo("Helicoptero","Heli T", "H-222",DefineCor(),2011,1,250000);
        Aereo a3 = new Aereo("Balão","BallFly","Ba-333",2,10000);
        Aereo a4 = new Aereo("Dirigivel","Duff","D-444",1,5000);
                
        Terrestre t1 = new Terrestre('B',"Fusion","PCA-111",DefineCor(),2014,2,70000);
        Terrestre t2 = new Terrestre('A',"Honda Moto","MTA-222",DefineCor(),2015,1,20000);
        Terrestre t3 = new Terrestre('B', "Civic", "PBC-333",1,50000);
        Terrestre t4 = new Terrestre('A', "Kia Moto", "MUY-444",2,10000);
        
        //atribuindo a 'cor' e 'ano' 
        a3.setCor(DefineCor());
        a3.setAno(2012);
        a4.setCor(DefineCor());
        a4.setAno(2013);
        t3.setCor(DefineCor());
        t3.setAno(2016);
        t4.setCor(DefineCor());
        t4.setAno(2017);
        
        //mostrando quantidade de automoveis cadastrados
        System.out.println("Quantidade de Cadastros: "+Automovel.getCont()+"\n");
        
        //polimorfismo
        
        /*Automovel [] v = new Automovel[8];
        v[1] = a1;
        v[2] = a2;
        v[3] = a3;
        v[4] = a4;
        v[5] = t1;
        v[6] = t2;
        v[7] = t3;
        v[8] = t4;
        */
        Automovel [] automoveis = {a1,a2,a3,a4,t1,t2,t3,t4};
        
        //FOR aprimorado
        /*
        for(Automovel v: automoveis){
            if(v instanceof Terrestre)
                System.out.println("*** Veículo Terrestre ***"+( ( Terrestre ) v ).toString()+"\n");
            if (v instanceof Aereo)
                System.out.println("*** Veículo Aéreo ***"+((Aereo)v).toString()+"\n");
        }*/
        //FOR tradicional
        for(int c=0;c<automoveis.length;c++){
            
            if(automoveis[c] instanceof Terrestre)
                System.out.println("*** Veículo Terrestre ***"+( ( Terrestre ) automoveis[c]).toString()+"\n");
            if (automoveis[c] instanceof Aereo)
                System.out.println("*** Veículo Aéreo ***"+((Aereo)automoveis[c]).toString()+"\n");
        }
          
        //método Aumento
        int c=1;
        System.out.println("Aumento de 10% no valor de fabrica: ");
        for(Automovel a: automoveis){
            System.out.println("Automovel "+c+": "+a.aumento(0.1));
            c ++;
        }
        
        //Classe ENUM-Funcionários
        System.out.println("");
        System.out.println("*** FUNCIONÁRIOS ***");
        for(Funcionarios f: Funcionarios.values()){
            System.out.println(f+"~> " +f.ficha());
        }
    }
    public static String DefineCor(){
     List<String> lista = new ArrayList<String>() ;
     lista.add("Vermelho");
     lista.add("Preto");
     lista.add("Azul");
     lista.add("Roxo");
     lista.add("Amarelo");
     lista.add("Branco");
     Collections.shuffle(lista) ;
     
     Random random = new Random();
     return lista.get((int)Math.random() * lista.size());    
    }
  
}
