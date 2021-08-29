
package com.uniantioquia.pruebasunitarias;

import java.util.ArrayList;
import java.util.List;


public class Calculadora {
    
    /*
    public static void main(String[] args) {
        
        int numeroUno = 3;
        int numeroDos = 2;
        
        int resultado = sumar(numeroUno, numeroDos);
        System.out.println("Resultado: 3 + 2 = " + resultado);
        int esperado = 5;
        if(resultado == esperado){
            System.out.println("El programa esta ok");
        }else{
            System.out.println("El programa esta malo");
        }
        
    }
    */
    
    // Daños colaterales o afectacion al entorno
    private int anwser = 0;
    List<String> historial= new ArrayList<>();
    
    public Calculadora(){
    }

    public int sumar(int numeroUno, int numeroDos) {
        anwser += numeroUno + numeroDos;
        // Suma: 3 + 2 = 5
        historial.add(String.format("Suma: %d + %d = %d", numeroUno, numeroDos, anwser));
        return anwser;
    }
    
    public int restar(int numeroUno, int numeroDos) {
        return numeroUno - numeroDos;
    }
    
    public int dividir(int numeroUno, int numeroDos) {
        anwser += numeroUno / numeroDos;
        if(numeroDos == 0){
            throw new ArithmeticException("No puedes diividir por cero");
        }
        return anwser;
    }

    public int getAnwser() {
        return anwser;
    }
    
    public void clear(){
        this.anwser = 0;
    }
    
    public void operacionLenta(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println("Entro");
            e.printStackTrace();
        }
    }
    
    public void bufleInfinito(){
        for(;;);
    }

}
