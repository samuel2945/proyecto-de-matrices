
import models.ConsumoAnualModel;
public class App {
    public static void main(String[] args) throws Exception {
        ConsumoAnualModel año = new ConsumoAnualModel(2,11,30,23);
        int consumo[][][][] = año.llenarCubo();
        for (int i = 0 ; i < 5; i++){
            for (int j = 0 ; j < 11; j++){
                for (int k = 0 ; k < 30; k++){
                    for (int l = 0 ; l < 23; l++){
                        System.out.println("cubo[" + i + "][" + j + "][" + k + "][" + l + "] = " + consumo[i][j][k][l]);
                    }
                }
            }
        }
    }
}
