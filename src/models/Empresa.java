package models;

import java.util.*;
import java.util.logging.*;

public class Empresa {

    private List<ContratoAluguer> m_listContratoAluguer;
    private List<Entrega> m_listEntregaAutomovel;

    public Empresa () {
        m_listContratoAluguer = new ArrayList<ContratoAluguer>();
        this.fillInContratoAluguer();
        m_listEntregaAutomovel = new ArrayList<Entrega>();
    }

    public static Empresa instance () {
        return null;
    }

    public Entrega criaEntregaAutomovel () {
        return new Entrega();
    }

    public List<ContratoAluguer> getContratoAluguerByNomeCliente(String nome) {
        List<ContratoAluguer> caList = new ArrayList<ContratoAluguer>();
        Iterator<ContratoAluguer> itr = m_listContratoAluguer.iterator();

        while (itr.hasNext()) {
            ContratoAluguer ca = itr.next();
            if (ca.getM_strNomeCliente().equals(nome))
                caList.add(ca);
        }

        return caList;
    }

    public void addEntregaAutomovel (Entrega ea) {
        m_listEntregaAutomovel.add(ea);
        Logger.getLogger("Rent-a-car").log(Level.INFO,
                "Entrega Automovel adicionada ao registo." );
    }

    private void fillInContratoAluguer() {
        Automovel au1 = new Automovel(
                "90-AA-10",
                "Azul",
                40000,
                "Varios riscos",
                20);
        ContratoAluguer ca1 = new ContratoAluguer(
                "Jose Martins",
                "Rua S. Tome",
                "99006611",
                "mail@mail.com",
                au1);
        
        m_listContratoAluguer.add(ca1);

        Automovel au2 = new Automovel(
                "20-EE-05",
                "Preto",
                5000,
                "Em perfeitas condiçoes",
                40);
        ContratoAluguer ca2 = new ContratoAluguer(
                "Jose Martins",
                "Rua S. Tome, Porto",
                "99006611",
                "mail@mail.com",
                au2);

        m_listContratoAluguer.add(ca2);

        Automovel au3 = new Automovel(
                "90-BB-10",
                "Branco",
                40000,
                "Varios riscos",
                20);
        ContratoAluguer ca3 = new ContratoAluguer(
                "Antonio Soares",
                "Rua Herois do Ultramar, Vila Nova de Gaia",
                "99006611",
                "mail@instituicao.pt",
                au3);

        m_listContratoAluguer.add(ca3);
    }
}

