
package ejemplos;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Alexander
 */
public class aleatorio {

    static int n = 0, fn=0;
    static int stop = 0;
    

    public static void main(String[] args) {
        
        Runnable r = new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(25);
                } catch (InterruptedException ex) {
                    Logger.getLogger(aleatorio.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("numer= " + n);
                stop=1;
            }
        };
        Thread t = new Thread(r);
        t.start();

        while (stop==0) {
            n=fn;
            fn++;
            if(fn==20){
                fn=0;
                System.out.print("");
            }
            
        }
        t.stop();
    }

}
