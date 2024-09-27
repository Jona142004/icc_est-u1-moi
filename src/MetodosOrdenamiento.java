public class MetodosOrdenamiento {

    public void sortBySelection(int[] arreglo,boolean asc){
        int tam = arreglo.length;
        
        //recorrer arreglo
        // metodo con boolean
        for(int i =0 ; i < tam -1 ; i++){
            int indice = i;
            for(int  j = i+1; j < tam  ; j++ ){
                if (asc? arreglo[j] < arreglo[indice] : arreglo[j] > arreglo[indice]){
                    indice=j;
                   
        }
            int aux = arreglo[indice];
            arreglo[indice] = arreglo[i];
            arreglo[i] = aux;
        
            }
            /* 
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
    */
        }
    }



    public void printArreglo(int[]arreglo){
        for (int i : arreglo){ //for each el arreglo va instanciando cada elemento del arreglo se va almacenando
            System.out.print(i + "-");
        }
    }
}