
package classeprincipal;


public class ClassePrincipal {

  
    public static void main(String[] args) {
         // Nova instância de um objeto Carro
        Classe c = new Classe();

        /**
         * Atribuindo valores aos atributos de forma direta (sem encapsulamento)
         * objeto.atributo = "valor";
         */
        c.chassi = "A123456B";
        c.cor = "Azul";
        c.modelo = "Uno";

        // Recuperando os valores armazenados nos atributos e mostrando na tela
        System.out.println("Chassi: " + c.chassi);
        System.out.println("Cor...: " + c.cor);
        System.out.println("Modelo: " + c.modelo);
        
    }
    
}
