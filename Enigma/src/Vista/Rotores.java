package Vista;

import Logica.*;
import java.awt.Container;

public class Rotores extends Container {

    private final Rotor[] rotor;
    private final MapRotor[] mf;

    public Rotores() {
        /*El rotor 0  es el de la izquierda*/
        rotor = new Rotor[]{new Rotor('Q'), new Rotor('E'), new Rotor('V')};
        mf = new MapRotor[]{new RotorI(), new RotorII(), new RotorIII()};

        for (int i = 0; i < 3; i++) {
            rotor[i].setBounds(26 + i * 86, 55, 90, 120);
            add(rotor[i]);
        }
        for (int i = 2; i > 0; i--) {
            rotor[i].setNext(rotor[i - 1]);
        }
    }

    public int transmitForward(int c) {
        for (int i = 2; i >= 0; i--) {
            /**IMPLEMENTAR**/
            /*Aquí se simula el flujo de energía del rotor dos al cero*/
        }
        return c; //Deberás regresar el caracter que obtienes después de pasar por el rotor cero
    }

    public int transmitBackward(int c) {
        for (int i = 0; i < 3; i++) {
            /**IMPLEMENTAR**/
            /*Aquí se simula el flujo de energía del rotor cero al dos*/
        }
        return c;//Deberás regresar el caracter que obtienes después de pasar por el rotor dos
    }

    public void increase() {
        rotor[2].down();
    }
}
