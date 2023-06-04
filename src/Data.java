public class Data {
    int ano;
    int mes;
    int dia;

    void imprimirDataFormatada() {
        System.out.println(this.dia + "/" + this.mes + "/" + this.ano);
    }

    public String toString() {
        return this.dia + "/" + this.mes + "/" + this.ano;
    }

    public int getAno() {
        return this.ano;
    }

    public int getMes() {
        return this.mes;
    }

    public int getDia() {
        return this.dia;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setMes(int mes) throws Exception {
        if (mes < 1 || mes > 12) {
            throw new Exception("Mês inválido");
        }
        this.mes = mes;
    }

    public void setDia(int dia) throws Exception {
        if (dia < 1 || dia > 31) {
            throw new Exception("Dia inválido");
        }
        if (this.mes == 2) {
            if (this.isBissexto()) {
                if (dia > 29) {
                    throw new Exception("Dia inválido");
                }
            } else {
                if (dia > 28) {
                    throw new Exception("Dia inválido");
                }
            }
        }
        if (this.mes == 4 || this.mes == 6 || this.mes == 9 || this.mes == 11) {
            if (dia > 30) {
                throw new Exception("Dia inválido");
            }
        }
        this.dia = dia;
    }

    public Data(int ano, int mes, int dia) throws Exception {
        this.setAno(ano);
        this.setMes(mes);
        this.setDia(dia);
    }

    private boolean isBissexto() {
        return (this.ano % 4 == 0 && this.ano % 100 != 0) || this.ano % 400 == 0;
    }


}
