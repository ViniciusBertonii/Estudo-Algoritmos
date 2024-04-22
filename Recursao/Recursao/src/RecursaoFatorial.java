public class RecursaoFatorial {
    public static void main(String[] args) throws Exception {

        System.out.println(fatorial(4));

    }


    public static int fatorial(int numero){
        
        if(numero == 1 ){
            return 1;
        }   else {
            return numero*fatorial(numero-1);
        }
    }

}
