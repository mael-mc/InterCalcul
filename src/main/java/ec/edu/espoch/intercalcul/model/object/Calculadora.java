package ec.edu.espoch.intercalcul.model.object;


public class Calculadora {
    
    private double numUno;
    private double numDos;

    public Calculadora(double numUno, double numDos) {
        this.numUno = numUno;
        this.numDos = numDos;
    }

    public Calculadora() {
    }

    public double getNumUno() {
        return numUno;
    }

    public void setNumUno(double numUno) {
        this.numUno = numUno;
    }

    public double getNumDos() {
        return numDos;
    }

    public void setNumDos(double numDos) {
        this.numDos = numDos;
    }
    
    public double sumar(){
        
        return numUno + numDos;
    }
    
}
