package appcarro;


public class Carro {

    String fabricante, modelo, cor, placa;
    double valor;
    int numeroPortas, anoFabricacao, anoModelo;

    public void setFabricante(String fabricante) {
        if (!fabricante.isEmpty()) {
            this.fabricante = fabricante;
        }
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setModelo(String modelo) {
        if (!modelo.isEmpty()) {
            this.modelo = modelo;
        }
    }

    public String getModelo() {
        return modelo;
    }

    public void setCor(String cor) {
        if (!cor.isEmpty()) {
            this.cor = cor;
        }
    }

    public String getCor() {
        return cor;
    }

    public void setPlaca(String placa) {
        if (!placa.isEmpty()) {
            this.placa = placa;
        }
    }

    public String getPlaca() {
        return placa;
    }

    public void setValor(double valor) {
        if (valor > 0) {
            this.valor = valor;
        }
    }

    public double getValor() {
        return valor;
    }

    public void setNumeroPortas(int numeroPortas) {
        if (numeroPortas > 0) {
            this.numeroPortas = numeroPortas;
        }
    }

    public int getNumeroPortas() {
        return numeroPortas;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if (anoFabricacao > 0) {
            this.anoFabricacao = anoFabricacao;
        }
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoModelo(int anoModelo) {
        if (anoModelo > 0) {
            this.anoModelo = anoModelo;
        }
    }

    public int getAnoModelo() {
        return anoModelo;
    }

    public void imprimir() {
        System.out.println("------------Imprimindo dados do carro----------");
        System.out.println("Fabricante: " + getFabricante());
        System.out.println("Modelo: " + getModelo());
        System.out.println("Cor: " + getCor());
        System.out.println("Placa: " + getPlaca());
        System.out.println("Valor: " + getValor());
        System.out.println("Número de Portas: " + getNumeroPortas());
        System.out.println("Ano de Fabricação: " + getAnoFabricacao());
        System.out.println("Ano do Modelo: " + getAnoModelo());
    }

}
