package models;



public class Automovel {

    private String m_strMatricula;

    private String m_strCor;

    private int m_numKM;

    private String m_estadoFisico;

    private int m_qtdCombustivel;

    public Automovel () {
    }

    public Automovel(String matricula, String cor, int numKM, String estadoFisico,
            int qtdCombustivel) {
        set_strMatricula(matricula);
        set_strCor(cor);
        set_numKM(numKM);
        set_estadoFisico(estadoFisico);
        set_qtdCombustivel(qtdCombustivel);
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
        this.m_numKM = val < 0 ? 0 : val;
    }

    public int get_qtdCombustivel () {
        return m_qtdCombustivel;
    }

    public void set_qtdCombustivel (int val) {
        this.m_qtdCombustivel = val < 0 ? 0 : val;
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

    @Override
    public String toString() {
        String str =
                "Matricula: " + this.get_strMatricula() +
                "\nCor: " + this.get_strCor() +
                "\nNum KM: " + this.get_numKM() +
                "\nEstado fisico: " + this.get_estadoFisico() +
                "\nQtd combustivel: " + this.get_qtdCombustivel();
        return str;
    }
}

