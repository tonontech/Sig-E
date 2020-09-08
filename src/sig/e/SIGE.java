package sig.e;

/**
 *
 * @author Anderson Tonon
 */
public class SIGE {

    
    public static int Printar(int numero){
        numero = numero + 1;
        return numero;
        
    }
    public static void main(String[] args) {
        System.out.println("Teste Projeto SIG-E");
        System.out.println("Anderson Tonon");
        int n = Printar(4);
        System.out.println("O numero Mais 1 = "+n);
        
    }
    
}
