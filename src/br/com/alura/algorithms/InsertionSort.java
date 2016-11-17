package br.com.alura.algorithms;

public class InsertionSort {

    public static void main(String args[]){
        Product[] products = {
                new Product("Lamborghini", 1000000),
                new Product("Jipe", 46000),
                new Product("Brasilia", 16000),
                new Product("Smart", 46000),
                new Product("Fusca", 17000)
        };

        insertionSort(products, products.length);

        for (Product product : products){
            System.out.println(product.getName() + " cost " + product.getPrice());
        }
    }

    private static void insertionSort(Product[] products, int numberOfElements) {
        for (int actual = 0; actual < numberOfElements; actual++){
            int analysis = actual;
            while (analysis > 0 && products[analysis].getPrice() < products[analysis-1].getPrice()){
                Product produtoAnalise = products[analysis];
                Product produtoAnalisemenos1 = products[analysis-1];
                products[analysis] = produtoAnalisemenos1;
                products[analysis-1] = produtoAnalise;
                analysis--;

            }

        }
    }
}
