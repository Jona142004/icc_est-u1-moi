public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenemiento");
        
        metodosordenamiento mO = new metodosordenamiento();
        int[] arreglo = {5,7,30,12,9};
        int[] arregloOrdenado = mO.sortBySelection(arreglo);
        mO.printArregloOrdenado(arregloOrdenado);
    }

}
