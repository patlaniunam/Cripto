package Logica;

public class RotorI extends MapRotor {

    public RotorI() {
    	forward = new MapFunction(new Character[]{'U','W','Y','G','A','D','F','P','V','Z','B','E','C','K','M','T','H','X','S','L','R','I','N','Q','O','J'});
    	backward = new MapFunction(new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'});
    }
}
