package br.com.alura.algorithms;

public class SelectionSort {
    public static void main(String args[]){
        Product[] products = {
                new Product("Lamborghini", 1000000),
                new Product("Jipe", 46000),
                new Product("Brasilia", 16000),
                new Product("Smart", 46000),
                new Product("Fusca", 17000)
        };

        selectionSort(products, products.length);

        for (Product product : products){
            System.out.println(product.getName() + " cost " + product.getPrice());
        }
    }

    private static void selectionSort(Product[] products, int numberOfElements) {
        for (int actual = 0; actual < numberOfElements -1; actual++){
            int smaller = searchSmaller(products, actual, numberOfElements - 1);

            Product actualProduct = products[actual];
            Product smallerProduct = products[smaller];
            products[actual] = smallerProduct;
            products[smaller] = actualProduct;
        }
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