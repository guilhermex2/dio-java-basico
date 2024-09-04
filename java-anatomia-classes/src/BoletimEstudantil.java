public class BoletimEstudantil {
    public static void main(String[] args) {
        int numeroUm = 6;
        int numeroDois = 6;

        int somarNumeros = Somar(numeroUm, numeroDois);
        System.out.println(somarNumeros);
    }
    public static int Somar(int numeroUm, int numeroDois) {
        return numeroUm + numeroDois;
    }
}
