package models;


public class ContratoAluguer {

    private Automovel automovel;
    private String m_strNomeCliente, m_strEnderecoCliente,
            m_strTelefoneCliente, m_strEmailCliente;

    public ContratoAluguer () {
    }

    public ContratoAluguer(String nome, String endereco, String telef,
            String email, Automovel a) {
        setM_strNomeCliente(nome);
        setM_strEnderecoCliente(endereco);
        setM_strTelefoneCliente(telef);
        setM_strEmailCliente(email);
        setAutomovel(a);
    }

    public void setAutomovel (Automovel a) {
        automovel = a;
    }

    public Automovel getAutomovel () {
        return automovel;
    }

    /**
     * @return the m_strNomeCliente
     */
    public String getM_strNomeCliente() {
        return m_strNomeCliente;
    }

    /**
     * @param m_strNomeCliente the m_strNomeCliente to set
     */
    public void setM_strNomeCliente(String m_strNomeCliente) {
        this.m_strNomeCliente = m_strNomeCliente;
    }

    /**
     * @return the m_strEnderecoCliente
     */
    public String getM_strEnderecoCliente() {
        return m_strEnderecoCliente;
    }

    /**
     * @param m_strEnderecoCliente the m_strEnderecoCliente to set
     */
    public void setM_strEnderecoCliente(String m_strEnderecoCliente) {
        this.m_strEnderecoCliente = m_strEnderecoCliente;
    }

    /**
     * @return the m_strTelefoneCliente
     */
    public String getM_strTelefoneCliente() {
        return m_strTelefoneCliente;
    }

    /**
     * @param m_strTelefoneCliente the m_strTelefoneCliente to set
     */
    public void setM_strTelefoneCliente(String m_strTelefoneCliente) {
        this.m_strTelefoneCliente = m_strTelefoneCliente;
    }

    /**
     * @return the m_strEmailCliente
     */
    public String getM_strEmailCliente() {
        return m_strEmailCliente;
    }

    /**
     * @param m_strEmailCliente the m_strEmailCliente to set
     */
    public void setM_strEmailCliente(String m_strEmailCliente) {
        this.m_strEmailCliente = m_strEmailCliente;
    }

    @Override
    public String toString() {
        String str =
                "Contrato de aluguer do cliente: " + this.getM_strNomeCliente() +
                "\nEndereco: " + this.getM_strEnderecoCliente() +
                "\nTelefone: " + this.getM_strTelefoneCliente() +
                "\nEmail: " + this.getM_strEmailCliente();

        return str;
    }

}

