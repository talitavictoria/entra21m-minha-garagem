
import java.awt.EventQueue;
import view.JFrameInicial;

/**
 *
 * @author (name=Cristhian Gustavol lourenço,date=08-11-2017)
 */
public class Principal {
    
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();
            }
        });
    }
}
