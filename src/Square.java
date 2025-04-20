// Classe para o Quadrado, com o atributo lado
class Quadrado implements Figura {
    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}