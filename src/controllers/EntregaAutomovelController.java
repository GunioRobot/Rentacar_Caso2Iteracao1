package controllers;

import models.*;
import java.util.List;

public class EntregaAutomovelController {
    private Empresa m_empresa;
    private ContratoAluguer m_contratoAluguer;
    private Entrega m_entregaAutomovel;

    public EntregaAutomovelController (Empresa empresa) {
        m_empresa = empresa;
    }

    public void iniciaEntregaAutomovel() {
        this.m_entregaAutomovel = m_empresa.criaEntregaAutomovel();
    }

    public List<ContratoAluguer> getContratoAluguerByNomeCliente (String nome) {
        return m_empresa.getContratoAluguerByNomeCliente(nome);
    }

    public void setContratoAluguer (ContratoAluguer ca) {
        m_contratoAluguer = ca;
    }

    public void setAutomovel (Automovel a) {
        m_contratoAluguer.setAutomovel(a);
    }

    public void terminaRegistoEntregaAutomovel () {
        m_empresa.addEntregaAutomovel(m_entregaAutomovel);
    }

    public void setLocalEntrega (String local) {
        m_entregaAutomovel.set_localEntrega(local);
    }

}

