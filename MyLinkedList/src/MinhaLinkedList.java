public class MinhaLinkedList {
    /*public boolean add (int element){
        if (iEmpity()) {
                        
        }else{

        }
        
    }
    */

    public int indexOf(int element){
        Nodo navegador=head;
        int count;

        while (navegador!=null) {
            if (navegador.valor==element) {
                return count;
            }
            navegador=navegador.prox;

            count++;
        }
    }

}
