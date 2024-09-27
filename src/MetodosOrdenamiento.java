public class metodosordenamiento {

    public int[] sortBySelection(int[] arreglo){
        int tam = arreglo.length;
        
        //recorrer arreglo
        for(int  i = 0; i < tam; i++ ){

            int indice = i;
            for(int  j = i + 1; j < tam; j++ ){
                if(arreglo[j] < arreglo[indice]){
                    indice = j;
                }
            }
            // aqui se hace el intercambio porque aqui reccore todo del indice por el primero
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        }
        return arreglo;
    }
    public void printArregloOrdenado(int[]arreglo){
        for (int elemento : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(elemento + "-");
        }
}
}