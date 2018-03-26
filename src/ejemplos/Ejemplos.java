/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

/**
 *
 * @author Alexander
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Carro[][] carros = new Carro[3][3];
        
        carros[0][0] = new Carro("fort", "2015", "Azul");
        carros[0][1] = new Carro("audi", "2015", "Azul");
        carros[0][2] = new Carro("fort", "2015", "negro");
        carros[1][0] = new Carro("fort", "2015", "Azul");
        carros[1][1] = new Carro("audi", "2015", "negro");
        carros[1][2] = new Carro("toyota", "2015", "Azul");
        carros[2][0] = new Carro("fort", "2015", "Azul");
        carros[2][1] = new Carro("audi", "2015", "negro");
        carros[2][2] = new Carro("fort", "2015", "Azul");
        
        System.out.println("agrgados repositorio ");
        // TODO code application logic here
        int j=1;
        for (int i = 0; i < 3; i=(j%3==0?i+1:i)) {//i=(j%3==0?i+1:i)
            System.out.print(i==0?carros[i][j-1].getMarca():i==1?carros[i][j-1].getColor():carros[i][j-1].getAño()+"\t"+(j%3==0?"\n":""));
       j=j<3?j+1:1;
//            System.out.println("jota: "+j);
//System.out.println(carros[i][1].getMarca());
        }
    }
    
}
