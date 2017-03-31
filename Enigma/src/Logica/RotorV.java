package Logica;

public class RotorV extends MapRotor {

    public RotorV() {        
    	forward = new MapFunction(new Character[]{'Q','C','Y','L','X','W','E','N','F','T','Z','O','S','M','V','J','U','D','K','G','I','A','R','P','H','B'});
    	backward = new MapFunction(new Character[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'});
    }
}
