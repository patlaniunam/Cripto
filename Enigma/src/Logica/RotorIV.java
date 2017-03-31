package Logica;

public class RotorIV extends MapRotor {

    public RotorIV() {
    	forward = new MapFunction(new Character[]{'H','Z','W','V','A','R','T','N','L','G','U','P','X','Q','C','E','J','M','B','S','K','D','Y','O','I','F'});
    	backward = new MapFunction(new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'});
    }
}
