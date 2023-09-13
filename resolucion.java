public class Fraccion {
    private int numerador;
    private int denominador;
    
    public Fraccion(){}
    
    public Fraccion(int _numerador, int _denominador) {
        this.numerador = _numerador;
        this.denominador = _denominador;
    }
    
    public void setNumerador(int _numerador){
        this.numerador = _numerador;
    }
    
    public int getNumerador(){
        return this.numerador;
    }
    
    public void setDenominador(int _denominador){
        this.denominador = _denominador;
    }
    
    public int getDenominador(){
        return this.denominador;
    }
    
}
