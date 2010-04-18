package views;

import models.Empresa;
import helpers.*;

public class MenuUI {
    private Empresa m_empresa;
    private String opcao;

    public MenuUI (Empresa empresa) {
        m_empresa = empresa;
    }

    public void run () {
        opcao = "1";

        System.out.println("Rent-a-Car App");
        System.out.println("Caso de Uso: Entrega de automovel - Iteracao 1");
        
        do {
            System.out.println("\n1. Elaborar Contrato");
            System.out.println("2. Entregar Automovel");
            System.out.println("3. Devolver Automovel");
            System.out.println("0. Sair");

            opcao = InputHelper.readLineFromConsole("Introduza opção: ");

            if (opcao.equals("2")) {
                EntregaAutomovelUI uiEA = new EntregaAutomovelUI(m_empresa);
                uiEA.run();
            }
            if (opcao.equals("1") || opcao.equals("3")) {
                System.out.println("Opcao nao implementada.");
            }

        } while (!opcao.equals("0"));
    }
}
