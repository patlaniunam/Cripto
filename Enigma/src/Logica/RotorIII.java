package Logica;

public class RotorIII extends MapRotor {

    public RotorIII() {
    	forward = new MapFunction(new Character[]{'T','A','G','B','P','C','S','D','Q','E','U','F','V','N','Z','H','Y','I','X','J','W','L','R','K','O','M'});
    	backward = new MapFunction(new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'});
    }
}
