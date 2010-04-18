package views;

import helpers.*;
import models.*;
import controllers.EntregaAutomovelController;
import java.util.*;

public class EntregaAutomovelUI {

    private Empresa empresa;
    private EntregaAutomovelController entregaController;
    private ContratoAluguer cAluguer;

    public EntregaAutomovelUI (Empresa empresa) {
        empresa = new Empresa();
        entregaController = new EntregaAutomovelController(empresa);
    }

    public void run () {
        
        iniciaEntregaAutomovel();

        // Requer nome do cliente
        String nomeCliente;
        System.out.println("Indique nome do cliente ou ENTER para cancelar.");
        do {
            nomeCliente = InputHelper.readLineFromConsole("Nome do cliente: ");
            
            if (nomeCliente.equals(""))
                return;
        } while (!InputHelper.validateName(nomeCliente));


        if (!displayContratoCliente(nomeCliente)) {
            System.out.println("Nao existe nenhum contrato para o cliente " + nomeCliente);
            return;
        }

        entregaController.setContratoAluguer(this.cAluguer);
        entregaController.setAutomovel(displayInfoAutomovel());

        String local = InputHelper.readLineFromConsole("Indique local de entrega: ");
        entregaController.setLocalEntrega(local);
        
        this.printComprovativoEntrega();

        entregaController.terminaRegistoEntregaAutomovel();
    }

    private void iniciaEntregaAutomovel() {
        entregaController.iniciaEntregaAutomovel();
    }

    private Automovel displayInfoAutomovel () {
        Automovel aut = this.cAluguer.getAutomovel();
        
        System.out.println("\nDados do automovel associado ao contrato:");
        System.out.println(aut.toString());
        
        String opcao = InputHelper.readLineFromConsole("Pretende alterar dados do automovel? (Y/N)");
        if (opcao.equals("Y")) {

            do {
                opcao = InputHelper.readLineFromConsole("Introduza nova matricula (00-AA-00): ");
            } while (!InputHelper.validateMatricula(opcao));
            aut.set_strMatricula(opcao);

            opcao = InputHelper.readLineFromConsole("Introduza nova cor: ");
            aut.set_strCor(opcao);

            opcao = InputHelper.readLineFromConsole("Introduza novo num KM: ");
            aut.set_numKM(new Integer(opcao));

            opcao = InputHelper.readLineFromConsole("Introduza novo estado fisico: ");
            aut.set_estadoFisico(opcao);

            opcao = InputHelper.readLineFromConsole("Introduza nova qtd combustivel: ");
            aut.set_qtdCombustivel(new Integer(opcao));
        }

        return aut;
    }

    private void printComprovativoEntrega () {
        System.out.println("\nA imprimir comprovativos...\n");
    }

    private boolean displayContratoCliente (String nome) {
        boolean hasContrato = false;
        List<ContratoAluguer> listCA = entregaController.getContratoAluguerByNomeCliente(nome);
        Iterator<ContratoAluguer> itr = listCA.iterator();

        int counter = 0;

        while (itr.hasNext()) {
            hasContrato = true;
            counter++;
            System.out.println("\nContrato num: " + counter);

            ContratoAluguer ca = itr.next();
            System.out.println(ca.toString());
        }

        if (hasContrato) {
            String opcao;
            int nOpcao;
            do {
                opcao = InputHelper.readLineFromConsole("Introduza num do contrato: ");
                nOpcao = new Integer(opcao);
            } while (nOpcao < 1 || nOpcao > listCA.size());

            this.cAluguer = listCA.get(nOpcao - 1);
        }

        return hasContrato;
        
    }

}

