public class MinhaClasse {
    public static void main(String [] args) {
        String primeiroNome = "Guilherme";
        String segundoNome = "Xavier";

        String nomeComplo = nomeComleto(primeiroNome, segundoNome);

        System.out.println(nomeComplo);
        
    }
    public static String nomeComleto(String primeiroNome, String segundoNome){
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
