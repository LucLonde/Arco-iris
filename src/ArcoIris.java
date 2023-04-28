import java.util.*;

public class ArcoIris {
    public static void main(String[] args) {
        // criando o conjunto de cores do arco-íris
        Set<String> cores = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));

        // A. exibindo as cores uma abaixo da outra
        System.out.println("Cores do arco-íris:");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // B. quantidade de cores do arco-íris
        System.out.println("O arco-íris tem " + cores.size() + " cores");

        // C. exibindo as cores em ordem alfabética
        List<String> coresOrdenadas = new ArrayList<>(cores);
        Collections.sort(coresOrdenadas);
        System.out.println("Cores do arco-íris em ordem alfabética:");
        for (String cor : coresOrdenadas) {
            System.out.println(cor);
        }

        // D. exibindo as cores na ordem inversa da que foi informada
        List<String> coresInversas = new ArrayList<>(cores);
        Collections.reverse(coresInversas);
        System.out.println("Cores do arco-íris na ordem inversa:");
        for (String cor : coresInversas) {
            System.out.println(cor);
        }

        // E. exibindo as cores que começam com a letra "V"
        System.out.println("Cores do arco-íris que começam com a letra \"V\":");
        for (String cor : cores) {
            if (cor.startsWith("v") || cor.startsWith("V")) {
                System.out.println(cor);
            }
        }

        // F. removendo todas as cores que não começam com a letra "V"
        Iterator<String> it = cores.iterator();
        while (it.hasNext()) {
            String cor = it.next();
            if (!cor.startsWith("v") && !cor.startsWith("V")) {
                it.remove();
            }
        }
        System.out.println("Cores do arco-íris que começam com a letra \"V\" (após remoção das outras cores):");
        for (String cor : cores) {
            System.out.println(cor);
        }

        // G. limpando o conjunto
        cores.clear();
        System.out.println("O conjunto de cores do arco-íris foi limpo");

        // H. verificando se o conjunto está vazio
        System.out.println("O conjunto de cores do arco-íris está vazio? " + cores.isEmpty());
    }
}
