public class App {
    /*public static void main(String[] args) throws Exception {
        System.out.println("Metodo de ordenemiento");
        metodosordenamiento mO = new metodosordenamiento();*/
    public static void main(String[] args) throws Exception{
        MetodosOrdenamiento  mO = new MetodosOrdenamiento();
        int[] arreglo = {5,7,30,12,9};
        mO.sortBySelection(arreglo,true);
        mO.printArreglo(arreglo);
        System.out.println();
        mO.sortBySelection(arreglo,false);
        mO.printArreglo(arreglo);
    }


       /*  int[] arreglo = {5,7,30,12,9};
        int[] arregloOrdenado = mO.sortBySelection(arreglo);
        mO.printArregloOrdenado(arregloOrdenado);*/
       
}


