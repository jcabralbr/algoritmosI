package br.com.alura.algorithms;


public class SmallerPriceTest {

    public static void main(String[] args){
        Product[] products = {
            new Product("Lamborghini", 1000000),
            new Product("Jipe", 46000),
            new Product("Brasilia", 16000),
            new Product("Smart", 46000),
            new Product("Fusca", 17000)
        };

        int cheapper = searchSmaller(products, 0, products.length - 1);

        System.out.println("cheapper: " + cheapper);
        System.out.println("The carr " + products[cheapper].getName() + " is the cheapper and cost " + products[cheapper].getPrice());
    }

    private static int searchSmaller(Product[] products , int start, int end) {
        int cheaper = start;
        for (int actual = start; actual <= end; actual++){
            if (products[actual].getPrice() < products[cheaper].getPrice()){
                cheaper = actual;
            }
        }
        return cheaper;
    }
}
