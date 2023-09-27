package first;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        factura f = new factura("ordenador", 1000);
        factura f2 = new factura("mobil", 450);
        factura f3 = new factura("impressora", 200);
        factura f4 = new factura("imac", 1499.99);

        List<factura> lista = new ArrayList<factura>();

        lista.add(f);
        lista.add(f2);
        lista.add(f3);
        lista.add(f4);

        lista = filter(lista, 1000);

        for (factura factura : lista) {
            System.out.println(factura.device + " " + factura.price);
        }
    }

    static List<factura> filter(List<factura> facturaList, double minPrice)  {
        return facturaList.stream().filter(
                factura -> factura.price < minPrice
        ).toList();
    }

}