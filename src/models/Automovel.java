package models;



public class Automovel {

    private String m_strMatricula;

    private String m_strCor;

    private int m_numKM;

    private String m_estadoFisico;

    private int m_qtdCombustivel;

    public Automovel () {
    }

    public String get_estadoFisico () {
        return m_estadoFisico;
    }

    public void set_estadoFisico (String val) {
        this.m_estadoFisico = val;
    }

    public int get_numKM () {
        return m_numKM;
    }

    public void set_numKM (int val) {
        this.m_numKM = val;
    }

    public int get_qtdCombustivel () {
        return m_qtdCombustivel;
    }

    public void set_qtdCombustivel (int val) {
        this.m_qtdCombustivel = val;
    }

    public String get_strCor () {
        return m_strCor;
    }

    public void set_strCor (String val) {
        this.m_strCor = val;
    }

    public String get_strMatricula () {
        return m_strMatricula;
    }

    public void set_strMatricula (String val) {
        this.m_strMatricula = val;
    }

}

