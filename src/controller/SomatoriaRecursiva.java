package controller;

public class SomatoriaRecursiva {

    public SomatoriaRecursiva (){
        super();
    }

    public double calcSomatoria (int n) {
        //Condição de parada: Quando N atinge como valor (1), finaliza.
        if (n == 1){
            return 1.0;
        }else{
            //Chamada da função
            return 1.0 / n + calcSomatoria(n - 1); //Termo N em função do termo anterior: Retorna 1/N + a somatória do termo anterior (1/(N-1) + ...)
        }
    }

}
