package heranca_parte4;

import java.util.List;
import java.util.ArrayList;
public class TesteCalculoArea {

    public static void main(String[] args) {
        List <Figura> figuras = new ArrayList <>();

        figuras.add(new Quadrado());
        figuras.add(new Quadrado());
        figuras.add(new Retangulo());

        for (Figura figura : figuras){
            System.out.println(figura.calcularArea());
        }
    }
    
}
