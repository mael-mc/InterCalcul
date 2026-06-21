
package ec.edu.espoch.intercalcul.controller.model;

import ec.edu.espoch.intercalcul.controller.interfaces.InterfazCalculadoraController;
import ec.edu.espoch.intercalcul.model.access.InterCalculadora;
import ec.edu.espoch.intercalcul.model.data.Calculadoras;
import ec.edu.espoch.intercalcul.model.object.Calculadora;


public class ControllerModel {
    
    private Calculadora calculadora;
    // private View view;
    private InterfazCalculadoraController interfazcalculadoracontroller ;
    private InterCalculadora intercalculadora = new Calculadoras();
    
    public ControllerCalculadora(View view){
        
        calculadora = new Calculadora();
        this.view=view;
    }
    
    public void controller(){
        
        try {
            double numberOne = Double.parseDouble(view.getNumUno());
            double numberTwo = Double.parseDouble(view.getNumDos());
            
            calculadora.setNumUno(numberOne);
            calculadora.setNumDos(numberTwo);
            double resultado = metodosCalcu.sumar(calculadora);
            
            view.mostrar(resultado);
            
        } catch (Exception e) {
            
            view.MostrarError();
            
        }
        
    }
    
    
}
