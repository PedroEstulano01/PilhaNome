/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pilhas;

/**
 *
 * @author Administrator
 */
public class Main {
    public static void main(String[] args) {
        String input = "UM CIENTISTA DA COMPUTACAO DEVE RESOLVER OS PROBLEMAS LOGICAMENTE";
        String resultado = PilhaInvertida.inverterPalavras(input);
        System.out.println(resultado);

        String input2 = "ESARF ATERCES ODALERAHCAB ME AICNEIC AD OACATUPMOC FI ONAIOG SUPMAC SOHNIRROM HE MU SOD SEROHLEM SOSRUC ED OACATUPMOC OD ODATSE ED SAIOG";
        String resultado2 = PilhaInvertida.inverterPalavras(input2);
        System.out.println(resultado2);
    }
}
