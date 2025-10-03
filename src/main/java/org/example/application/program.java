package org.example.application;

import org.example.entity.Pessoa;

public class program {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gui", 1, "Gui@gmail.com");
        Pessoa p3 = new Pessoa("Gusta", 2, "Gusta@gmail.com");
        Pessoa p2 = new Pessoa("Gab", 3, "Gab@gmail.com");
        System.out.println(p1);
        System.out.println(p3);
        System.out.println(p2);
    }
}
