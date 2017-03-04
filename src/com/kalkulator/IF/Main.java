package com.kalkulator.IF;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                char znak = 'k';
                double a , b , wynik = 0;
                System.out.printf("Zmienna:" + (int) znak);


                Scanner wejscie = new Scanner(System.in);

                System.out.printf("Podaj liczbę a: ");
                a = wejscie.nextInt();

                System.out.printf("Podaj liczbę b: ");
                b = wejscie.nextInt();

                System.out.printf("Podaj znak: ");

                znak = wejscie.next().charAt(0);

                switch (znak) {
                    case ('+'):
                        System.out.printf("Wykonuję operację dodawania");
                        wynik = a + b;
                        break;
                    case '-':
                        System.out.printf("Wykonuję odejmowanie");
                        wynik = a - b;
                        break;
                    case ('*'):
                        System.out.printf("Wykonuję mnożenie");
                        wynik = a * b;
                        break;
                    case ('/'):
                        System.out.printf("Wykonuję dzielenie");

                        if (b==0)
                        {
                           System.out.printf("Nie dzielimy przez zero!");
                        }
                        else{
                            wynik = a / b;
                        }

                }
                System.out.println("wynik: " + wynik);
                 System.out.println("I pocałujcie mnie, ... wiadomo");
            }
        }
