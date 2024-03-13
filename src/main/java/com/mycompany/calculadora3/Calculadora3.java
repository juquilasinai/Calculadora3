
package com.mycompany.calculadora3;
import javax.swing.JOptionPane;

public class Calculadora3 {

    public static void main(String[] args) {
        int n1=Integer.parseInt(JOptionPane.showInputDialog("Digita el num1: "));
        int n2=Integer.parseInt(JOptionPane.showInputDialog("Digita el num2: "));
        
        Operaciones op=new Operaciones();
        int suma=op.suma(n1,n2);
        int resta=op.resta(n1,n2);
        int multiplicacion=op.multiplicacion(n1,n2);
        int division=op.division(n1,n2);
        op.mostrarresultado(suma,resta,multiplicacion,division);
        
        op.mostrarresultado(op.suma(n1,n2),op.resta(n1,n2),op.multiplicacion(n1,n2),op.division(n1,n2));
    }
}