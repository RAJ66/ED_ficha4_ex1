/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ficha4_ex1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vitor
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        LinkedQueue lista = new LinkedQueue();

        int escolha = 5;

        switch (escolha) {
            case 0: //teste de adicionar n elementos
                lista.enqueue(1);
                lista.enqueue(2);
                System.out.println(lista.toString());
                break;

            case 1: {//teste de remover um elemento sem ter la nada
                try {

                    lista.dequeue();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());

            }

            break;
            case 2: {//teste de remover quanto so tem um elemento
                try {
                    lista.enqueue(1);
                    lista.dequeue();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());

            }

            break;
            case 3: {//teste de remover quanto so tem varios elemtentos
                try {
                    lista.enqueue(1);
                    lista.enqueue(2);
                    lista.enqueue(3);
                    lista.enqueue(4);

                    lista.dequeue();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());

            }

            break;
            case 4: {//teste do metodo first sem nada
                try {

                    lista.first();
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());

            }

            break;
            case 5: {//teste do metodo first quando tem varios elementos
                try {
                    lista.enqueue(1);
                                        lista.enqueue(2);
                    lista.enqueue(3);
                    lista.enqueue(4);

                    System.out.println("Primeiro:   "+lista.first()+"\n");
                } catch (EmptyCollectionException ex) {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println(lista.toString());

            }

            break;

        }
    }

}
