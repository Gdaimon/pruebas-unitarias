package com.uniantioquia.pruebasunitarias;

import java.util.ArrayList;
import org.junit.After;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Before;
import org.junit.Test;


public class CalculadoraTest {
    
    /*
    // Primero Metetodos Estaticos
    @Test
    public void suma(){
        int resultado = Calculadora.sumar(2, 3);
        int valorEsperado = 5; // 2+3 = 5
        // assertEquals(valorEsperado, resultado);
        assertEquals(valorEsperado, resultado);
    }
    
    @Test
    public void restar(){
        int resultado = Calculadora.restar(3, 2);
        int valorEsperado = 1; // 2+3 = 5
        assertEquals(valorEsperado, resultado);
    }
    */
    
    Calculadora calculadora;
    
    @Before
    public void before(){
        System.out.println("before()");
        calculadora = new Calculadora();
    }
    
    @After
    public void after(){
        System.out.println("after()");
        calculadora.historial = new ArrayList<>();
        calculadora.clear();
    }
    
    
    @Test
    public void testSuma(){
        //Calculadora calculadora = new Calculadora();
        System.out.println("testSuma()");
        // Dado que... -> Entradas
        int numeroUno = 3;
        int numeroDos = 2;
        
        // Cuando -> sujeto de pruebas
        int resultado = calculadora.sumar(numeroUno, numeroDos);
        int valorEsperado = 5; // 2+3 = 5
        
        // Entonces -> verificacion
        assertEquals(valorEsperado, resultado);
    }
    
    @Test
    public void testSumaDosNumerosNegativos(){
        // Calculadora calculadora = new Calculadora();
        System.out.println("testSumaDosNumerosNegativos()");
        // Dado que... -> Entradas
        int numeroUno = -3;
        int numeroDos = -2;
        
        // Cuando -> sujeto de pruebas
        int resultado = calculadora.sumar(numeroUno, numeroDos);
        int valorEsperado = -5; // 2+3 = 5
        
        // Entonces -> verificacion
        assertEquals(valorEsperado, resultado);
    }
    
    @Test
    public void testAnwersSuma(){
        // Daños colaterales -> afectacion al enterno
        // Calculadora calculadora = new Calculadora();
        System.out.println("getAnwser()");
        int numeroUno = 3;
        int numeroDos = 2;
        
        calculadora.sumar(numeroUno, numeroDos);
        int resultado = calculadora.getAnwser();
        int valorEsperado = 5; // 2+3 = 5

        // validar suma
        assertEquals(valorEsperado, resultado);
        
        // validar historial
        assertEquals(1, calculadora.historial.size());
        assertTrue(calculadora.historial.size() == 1);
    }
    
    @Test
    public void dividir(){
        System.out.println("dividir()");
        int numeroUno = 3;
        int numeroDos = 2;
       
        calculadora.dividir(numeroUno, numeroDos);
        int resultado = calculadora.getAnwser();
        int valorEsperado = 1; // 3/2 = 1

        // validar division
        assertEquals(valorEsperado, resultado);
    }
    
    @Test(expected = ArithmeticException.class)
    public void divivirPorCero(){
        System.out.println("dividir()");
        int numeroUno = 3;
        int numeroDos = 0;
       
        calculadora.dividir(numeroUno, numeroDos);
    }
    
    //@Test(timeout = 300)
    @Test(timeout = 3000)
    public void operacionLenta(){
        System.out.println("operacionLenta()");
        calculadora.operacionLenta();
    }
    
    @Test(timeout = 300)
    public void bucleInfinito(){
        System.out.println("bucleInfinito()");
        calculadora.bufleInfinito();
    }
    
    
    
}
